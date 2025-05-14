package com.twin.robots.example.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

data class Message(
    val message: String,
)

@RestController
class HelloWorldController {
    @GetMapping("/hello-world")
    fun helloWorld() = Message("Hello World!")
}
