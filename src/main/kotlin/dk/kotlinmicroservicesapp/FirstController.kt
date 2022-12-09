package dk.kotlinmicroservicesapp

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class FirstController {

    @GetMapping()
    fun greet(): String = "Hello, how you doing"
}