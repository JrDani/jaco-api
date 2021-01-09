package br.com.jrdani.jaco.service.vendor

import br.com.jrdani.jaco.model.vendor.TokenResponse
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class UserAccessService(
    @Value("\${vendorAPI.url}") private val url: String,
    @Value("\${vendorAPI.username}") private val username: String,
    @Value("\${vendorAPI.password}") private val password: String
) {
    fun redisInvalidateToken() {
        TODO("Not yet implemented")
    }

    // TODO: Cache this method with Redis
    fun getToken(): String {
        val bodyRequest = hashMapOf(
            "email" to username,
            "password" to password
        )
        val reqEntity = HttpEntity(bodyRequest, HttpHeaders())

        return RestTemplate().exchange("$url/users/token", HttpMethod.PUT, reqEntity, TokenResponse::class.java)
            .body!!
            .token
    }
}