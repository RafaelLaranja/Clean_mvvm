package com.example.cleanmvvm.data.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    private const val BASE_URL = "www.themealdb.com/api/json/v1/1/"


    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val mealApi: MealApi by lazy {
        retrofit.create(MealApi::class.java)
    }
}