package com.example.reservationapp.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.reservationapp.R
import com.example.reservationapp.databinding.FragmentSecondBinding
import com.example.reservationapp.viewmodel.FirstViewModel

class SecondFragment: Fragment() {

    private lateinit var binding: FragmentSecondBinding

    private val viewModel: FirstViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout XML file and return a binding object instance
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_second, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // dataBinding
        binding.firstViewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner


        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_second_to_third)
        }

        binding.plusButton.setOnClickListener {
            Log.d("ButtonLog", "+ボタン押した！")
            viewModel.increaseScore()
        }
        binding.minusButton.setOnClickListener {
            Log.d("ButtonLog", "-ボタン押した！")
            viewModel.decreaseScore()
        }
    }
}