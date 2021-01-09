package br.com.jrdani.jaco.config.restTemplate

import br.com.jrdani.jaco.controller.interceptor.RestTemplateHeaderModifierInterceptor
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.client.ClientHttpRequestInterceptor
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter
import org.springframework.web.client.RestTemplate

@Configuration
class RestTemplateConfig(
    private val objectMapper: ObjectMapper,
    private val interceptor: RestTemplateHeaderModifierInterceptor,
    @Value("\${vendorAPI.url}") private val vendorApiUrl: String
) {
    @Bean
    fun restTemplate(): RestTemplate {
        return RestTemplateBuilder()
            .rootUri(vendorApiUrl)
            .build()
            .apply {
                this.messageConverters = listOf(mappingJackson())
                this.interceptors = setInterceptors(this)
            }
    }

    private fun mappingJackson(): MappingJackson2HttpMessageConverter =
        MappingJackson2HttpMessageConverter(objectMapper)

    private fun setInterceptors(restTemplate: RestTemplate): List<ClientHttpRequestInterceptor> {
        return restTemplate.interceptors.apply {
            this.add(interceptor)
        }
    }
}