package com.twin.robots.example.services

import com.twin.robots.example.entities.PostEntity
import com.twin.robots.example.repositories.PostRepository
import com.twin.robots.example.requests.CreatePost
import com.twin.robots.example.responses.Post
import org.springframework.stereotype.Service
import java.time.Instant

@Service
class PostService(
    private val repository: PostRepository,
) {

    fun createPost(createPost: CreatePost) = repository.save(
        PostEntity(
            externalId = postTitleToId(createPost.title),
            communityId = createPost.communityId,
            title = createPost.title,
            content = createPost.content,
        )
    )

    fun getPost(postId: String) = repository.findByExternalId(postId)

    private fun postTitleToId(title: String): String {
        val alphaNumericRegex = Regex("[^A-Za-z0-9 ]")

        var formattedTitle = title.replace(alphaNumericRegex, "")

        if (formattedTitle.length > 23) {
            formattedTitle = formattedTitle.substring(0..23)
        }

        formattedTitle = formattedTitle.replace(" ", "_").lowercase()

        // Make sure the last 8 characters are unique using date
        formattedTitle = formattedTitle.take(15) + Instant.now().toEpochMilli().toString().takeLast(8)

        return formattedTitle
    }
}
