package br.com.jrdani.jaco.controller.interceptor

import br.com.jrdani.jaco.service.vendor.UserAccessService
import org.springframework.http.HttpRequest
import org.springframework.http.client.ClientHttpRequestExecution
import org.springframework.http.client.ClientHttpRequestInterceptor
import org.springframework.http.client.ClientHttpResponse
import org.springframework.stereotype.Component

@Component
class RestTemplateHeaderModifierInterceptor(
    private val userAccessService: UserAccessService
): ClientHttpRequestInterceptor {

    override fun intercept(
        request: HttpRequest,
        body: ByteArray,
        execution: ClientHttpRequestExecution
    ): ClientHttpResponse {
        putTokenOnRequest(request)
        return execution.execute(request, body)
    }

    private fun putTokenOnRequest(request: HttpRequest): HttpRequest {
        val token = userAccessService.getToken()
        return request.apply {
            this.headers.add("Authorization", "Bearer $token")
        }
    }
}
