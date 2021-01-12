package br.com.jrdani.jaco.exceptionHandler

import br.com.jrdani.jaco.service.vendor.UserAccessService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.client.HttpClientErrorException
import org.springframework.web.context.request.WebRequest
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
import java.time.OffsetDateTime

@ControllerAdvice
class ApiExceptionHandler(
    private val userAccessService: UserAccessService
): ResponseEntityExceptionHandler() {

    @ExceptionHandler(HttpClientErrorException::class)
    @Throws(HttpClientErrorException::class)
    fun httpClientErrorException(e: HttpClientErrorException, request: WebRequest): ResponseEntity<Problem> {
        val errorMessage = if (e.statusCode == HttpStatus.FORBIDDEN) {
            userAccessService.redisInvalidateToken()
            ProblemType.VENDOR_API_FORBIDDEN_ACCESS.description
        } else
            ProblemType.VENDOR_API_GENERAL.description

        val problem = Problem(
            status = e.statusCode.value(),
            timestamp = OffsetDateTime.now(),
            detail = errorMessage
        )

        return ResponseEntity(problem, HttpStatus.BAD_REQUEST)
    }

    companion object {
        data class Problem (
            val status: Int,
            val timestamp: OffsetDateTime,
            val detail: String
        )
    }
}
