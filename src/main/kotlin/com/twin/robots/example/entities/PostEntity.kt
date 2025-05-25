package com.twin.robots.example.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Table(name = "posts")
@Entity
data class PostEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(name = "external_id")
    val externalId: String,

    @Column(name = "community_id")
    val communityId: Long,

    @Column(name = "title")
    val title: String,

    @Column(name = "content")
    val content: String,
)
