package ru.netology.nmedia

data class Post(
    val id: Long,
    val author: String,
    val content: String,
    val published: String,
    var likes: Int = 0,
    var likedByMe: Boolean = false,
    var shares: Int = 999_999
)
