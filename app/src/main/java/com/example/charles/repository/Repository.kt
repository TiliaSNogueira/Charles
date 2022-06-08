package com.example.charles.repository

import com.example.charles.api.RetrofitInstance
import com.example.charles.model.Post

class Repository {

    suspend fun getPost(): Post {
       return RetrofitInstance.api.getPost()
    }
}

