package com.example.cleanmvvm.presenter

import androidx.lifecycle.ViewModel
import com.example.cleanmvvm.data.api.RetrofitHelper
import com.example.cleanmvvm.domain.model.mealCategory
import retrofit2.Response

class HomeMealViewModel : ViewModel() {

    private val retrofit = RetrofitHelper.mealApi

    suspend fun recuperarObjetos(){


    var retorno: Response<mealCategory>? = null

    try{
        retorno = retrofit.
    }

    }

}