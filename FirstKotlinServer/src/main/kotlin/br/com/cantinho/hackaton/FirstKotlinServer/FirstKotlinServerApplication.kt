package br.com.cantinho.hackaton.FirstKotlinServer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FirstKotlinServerApplication

fun main(args: Array<String>) {
    runApplication<FirstKotlinServerApplication>(*args)
}
