package com.twin.robots.example.responses

import com.twin.robots.example.entities.PostEntity

data class Post(
    val postId: String,
    val communityId: Long,
    val title: String,
    val content: String,
)

fun PostEntity.toPost(): Post = Post(
    externalId,
    communityId,
    title,
    content,
)
