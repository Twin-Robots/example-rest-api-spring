package com.twin.robots.example.controllers

import com.twin.robots.example.responses.Message
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/hello-world")
    fun helloWorld() = Message("Hello World!")
}
