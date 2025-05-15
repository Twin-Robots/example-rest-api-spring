package com.twin.robots.example.controllers

import com.twin.robots.example.requests.CreatePost
import com.twin.robots.example.responses.Post
import com.twin.robots.example.responses.toPost
import com.twin.robots.example.services.PostService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.net.URI

@RequestMapping("/posts")
@RestController
class PostController(
    private val service: PostService,
) {
    @PostMapping
    fun createPost(@RequestBody post: CreatePost): ResponseEntity<Post> {
        val body = service.createPost(post).toPost()
        return ResponseEntity.created(URI("/posts/${body.postId}")).body(body)
    }

    @GetMapping("/{postId}")
    fun getPost(
        @PathVariable postId: String,
    ): ResponseEntity<Post> {
        val post = service.getPost(postId)?.toPost()

        return if (post != null) {
            ResponseEntity.ok(post)
        } else {
            ResponseEntity.notFound().build()
        }
    }
}
