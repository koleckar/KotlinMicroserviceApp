package dk.microservicesApp

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
//@RequestMapping("/")
class FirstController {

    @GetMapping()
    fun greet(): String = "Hello, how you doing"
}