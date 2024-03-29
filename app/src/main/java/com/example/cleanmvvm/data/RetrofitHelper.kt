package com.example.cleanmvvm.data

import com.example.cleanmvvm.data.api.MealApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    private const val BASE_URL = "https://www.themealdb.com/api/json/v1/1/"


     val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val mealApi: MealApi by lazy {
        retrofit.create(MealApi::class.java)
    }
}