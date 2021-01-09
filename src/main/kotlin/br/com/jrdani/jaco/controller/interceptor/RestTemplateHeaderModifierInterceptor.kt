package br.com.jrdani.jaco.controller.interceptor

import br.com.jrdani.jaco.service.vendor.UserAccessService
import org.springframework.http.HttpRequest
import org.springframework.http.HttpStatus
import org.springframework.http.client.ClientHttpRequestExecution
import org.springframework.http.client.ClientHttpRequestInterceptor
import org.springframework.http.client.ClientHttpResponse
import org.springframework.stereotype.Component
import org.springframework.web.client.HttpClientErrorException

@Component
class RestTemplateHeaderModifierInterceptor(
    private val userAccessService: UserAccessService
): ClientHttpRequestInterceptor {
    override fun intercept(
        request: HttpRequest,
        body: ByteArray,
        execution: ClientHttpRequestExecution
    ): ClientHttpResponse {
        return try {
            putTokenOnRequest(request)
            execution.execute(request, body)
        } catch (e: HttpClientErrorException) {
            if (e.statusCode == HttpStatus.FORBIDDEN) {
                userAccessService.redisInvalidateToken()
                putTokenOnRequest(request)
                return execution.execute(request, body)
            } else
                throw e
        }
    }

    private fun putTokenOnRequest(request: HttpRequest): HttpRequest {
        val token = userAccessService.getToken()
        return request.apply {
            this.headers.add("Authorization", "Bearer $token")
        }
    }
}