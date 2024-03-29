package com.example.cleanmvvm.data.api

import com.example.cleanmvvm.domain.model.MealCategory
import retrofit2.Response
import retrofit2.http.GET

interface MealApi {
    @GET("categories.php")
    suspend fun getCategories(): Response<ApiResponse>
}