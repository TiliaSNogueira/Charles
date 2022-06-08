package com.example.charles.api

import com.example.charles.model.Post
import retrofit2.http.GET

interface API {

    @GET("posts/1")
    suspend fun getPost(): Post
}