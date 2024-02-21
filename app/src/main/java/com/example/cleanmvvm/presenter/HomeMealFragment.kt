package com.example.cleanmvvm.presenter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cleanmvvm.databinding.FragmentHomeMealBinding
import com.example.cleanmvvm.presenter.adapter.MealAdapter

class HomeMealFragment : Fragment() {

    private  var binding = FragmentHomeMealBinding.inflate(layoutInflater)

    private lateinit var rvMeal: RecyclerView

    private lateinit var viewModel: HomeMealViewModel

    // Método chamado para inflar o layout do Fragment
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Infla o layout do Fragment
        return binding.root
    }

    // Método chamado após a criação da View do Fragment
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvMeal = binding.RVmeals

        rvMeal.layoutManager = GridLayoutManager(requireContext(),2)

        val mealAdapter = MealAdapter()
    }
}