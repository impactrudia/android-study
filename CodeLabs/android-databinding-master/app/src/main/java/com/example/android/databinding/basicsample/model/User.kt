package com.example.android.databinding.basicsample.model

data class User(
    val id: Long,
    val firstName: String,
    val lastName: String,
    var likeCount: Int
)