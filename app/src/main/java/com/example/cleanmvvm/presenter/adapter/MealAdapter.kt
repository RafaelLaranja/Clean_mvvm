package com.example.cleanmvvm.presenter.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cleanmvvm.databinding.ItemRvBinding
import com.example.cleanmvvm.domain.model.mealCategory

class MealAdapter(private val meals: List<mealCategory>)
    : RecyclerView.Adapter<MealAdapter.MealViewHolder>() {

    inner class MealViewHolder(private val binding: ItemRvBinding)
        : RecyclerView.ViewHolder(binding.root){
            fun bind(meal: mealCategory){
                binding.apply {



                }
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MealViewHolder {

        val binding = ItemRvBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )

        return MealViewHolder(binding)

    }

    override fun onBindViewHolder(holder: MealViewHolder, position: Int) {

        val meal = meals[position]
        holder.bind(meal)

    }
    override fun getItemCount(): Int {

        return meals.size

    }

}