package com.example.dealapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

const val BASE_PACKAGE = "com.example"

@SpringBootApplication(scanBasePackages = [BASE_PACKAGE])
@EnableJpaRepositories(basePackages = [BASE_PACKAGE])
@EntityScan(basePackages = [BASE_PACKAGE])
class DealApiApplication

fun main(args: Array<String>) {
    runApplication<DealApiApplication>(*args)
}
