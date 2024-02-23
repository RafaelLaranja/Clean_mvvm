package com.example.cleanmvvm.presenter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cleanmvvm.databinding.FragmentHomeMealBinding
import com.example.cleanmvvm.presenter.adapter.MealAdapter

class HomeMealFragment : Fragment() {

    private  lateinit var binding: FragmentHomeMealBinding
    private lateinit var rvMeal: RecyclerView
    private lateinit var viewModel: HomeMealViewModel

    // Método chamado para inflar o layout do Fragment
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Infla o layout do Fragment
        binding = FragmentHomeMealBinding.inflate(inflater, container,false)
        return binding.root
    }

    // Método chamado após a criação da View do Fragment
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvMeal = binding.RVmeals
        rvMeal.layoutManager = LinearLayoutManager(requireContext())

        viewModel = ViewModelProvider(this)[HomeMealViewModel::class.java]//Get


        // obter a lista de MealCategory do ViewModel
        viewModel.mealCategories.observe(viewLifecycleOwner){categories ->
        val mealAdapter = MealAdapter(categories)
        rvMeal.adapter = mealAdapter
        }

        viewModel.recuperarObjetos()

    }
}