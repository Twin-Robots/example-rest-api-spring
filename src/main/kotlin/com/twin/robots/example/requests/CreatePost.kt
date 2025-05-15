package com.twin.robots.example.requests

data class CreatePost(
    val communityId: Long,
    val title: String,
    val content: String,
)
