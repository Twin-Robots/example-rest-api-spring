package com.twin.robots.example.repositories

import com.twin.robots.example.entities.PostEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PostRepository: CrudRepository<PostEntity, Long> {
    fun findByExternalId(postId: String): PostEntity?
}
