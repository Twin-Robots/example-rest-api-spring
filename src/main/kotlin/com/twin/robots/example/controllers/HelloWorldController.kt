package com.twin.robots.example.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {
    @GetMapping("/hello-world")
    fun helloWorld() = "Hello World!"
}
