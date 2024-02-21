package com.example.cleanmvvm.presenter

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cleanmvvm.R

class HomeMealFragment : Fragment() {

    companion object {
        fun newInstance() = HomeMealFragment()
    }

    private lateinit var viewModel: HomeMealViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home_meal, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HomeMealViewModel::class.java)
        // TODO: Use the ViewModel
    }
}