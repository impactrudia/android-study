package com.example.android.databinding.basicsample.model

import com.example.android.databinding.basicsample.data.Popularity

data class User(
    val id: Long,
    val firstName: String,
    val lastName: String,
    var likeCount: Int,
    var popularity: Popularity = Popularity.NORMAL
)