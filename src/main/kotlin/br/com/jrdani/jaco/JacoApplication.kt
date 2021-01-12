package br.com.jrdani.jaco

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@SpringBootApplication
@EnableCaching
class AccountApplication

fun main(args: Array<String>) {
	runApplication<AccountApplication>(*args)
}
