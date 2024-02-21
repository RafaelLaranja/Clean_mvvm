package com.example.cleanmvvm.domain.model

import com.google.gson.annotations.SerializedName

data class mealCategory(
    //Classe para receber as informações da api
    @SerializedName ("idCategory")val id : String,
    @SerializedName("strCategory") val Category : String,
    @SerializedName ("strCategoryDescription") val description: String,
    @SerializedName ("strCategoryThumb") val Image: String
)