package com.example.cleanmvvm.presenter.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cleanmvvm.databinding.ItemRvBinding
import com.example.cleanmvvm.domain.model.MealCategory
import com.squareup.picasso.Picasso

class MealAdapter(private val meals: List<MealCategory>)
    : RecyclerView.Adapter<MealAdapter.MealViewHolder>() {

    inner class MealViewHolder(private val binding: ItemRvBinding)
        : RecyclerView.ViewHolder(binding.root){
            fun bind(meal: MealCategory){
                binding.apply {
                    Picasso.get()
                        .load(meal.Image)
                        .into(binding.ivImage)

                    binding.tvCategory.text = meal.category
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