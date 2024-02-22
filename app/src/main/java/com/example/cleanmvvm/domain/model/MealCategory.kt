package com.example.cleanmvvm.domain.model

import com.google.gson.annotations.SerializedName

data class MealCategory(
    //Classe para receber as informações da api
    @SerializedName ("idCategory")val id : String,
    @SerializedName("strCategory") val category : String,
    @SerializedName ("strCategoryDescription") val description: String,
    @SerializedName ("strCategoryThumb") val Image: String
)