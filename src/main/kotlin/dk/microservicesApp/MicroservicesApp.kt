package dk.microservicesApp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinMicroservicesAppApplication

fun main(args: Array<String>) {
	runApplication<KotlinMicroservicesAppApplication>(*args)
}
