package com.example.cleanmvvm.data.api

import com.example.cleanmvvm.domain.model.MealCategory
import com.google.gson.annotations.SerializedName

data class ApiResponse(
@SerializedName("categories") val categories: List<MealCategory>
)
