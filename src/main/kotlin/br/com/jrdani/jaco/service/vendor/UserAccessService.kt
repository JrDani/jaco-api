package br.com.jrdani.jaco.service.vendor

import br.com.jrdani.jaco.model.vendor.TokenResponse
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.cache.annotation.CacheEvict
import org.springframework.cache.annotation.Cacheable
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

    @CacheEvict("vendor:token")
    fun redisInvalidateToken() {}

    @Cacheable("vendor:token")
    fun getToken(): String {
        logger.info("Request new Third Party API token")
        val bodyRequest = hashMapOf(
            "email" to username,
            "password" to password
        )
        val reqEntity = HttpEntity(bodyRequest, HttpHeaders())

        return RestTemplate().exchange("$url/users/token", HttpMethod.PUT, reqEntity, TokenResponse::class.java)
            .body!!
            .token
    }

    companion object {
        private val logger = LoggerFactory.getLogger(UserAccessService::class.java)
    }
}
