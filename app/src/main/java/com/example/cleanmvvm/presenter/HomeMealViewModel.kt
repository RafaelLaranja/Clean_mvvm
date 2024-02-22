package com.example.cleanmvvm.presenter

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cleanmvvm.data.RetrofitHelper
import com.example.cleanmvvm.domain.model.MealCategory
import kotlinx.coroutines.launch

class HomeMealViewModel : ViewModel() {

    private val _mealCategories = MutableLiveData<List<MealCategory>>()
    val mealCategories: LiveData<List<MealCategory>> = _mealCategories

    private val retrofit = RetrofitHelper.mealApi

    fun recuperarObjetos(){
        viewModelScope.launch {
            try{
                val retorno = retrofit.getCategories()
                if (retorno.isSuccessful){

                    val categories = retorno.body()?.categories ?: emptyList()
                    _mealCategories.postValue(categories)

                    Log.i("HomeMealViewModel", "Categorias recuperadas: $categories")
                }


            }catch (e:Exception){

                Log.e("HomeMealViewModel", "Erro ao recuperar categorias: ${e.message}", e)

            }
        }



    }

}