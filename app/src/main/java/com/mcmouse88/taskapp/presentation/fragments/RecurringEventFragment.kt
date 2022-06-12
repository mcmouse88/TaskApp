package com.mcmouse88.taskapp.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.mcmouse88.taskapp.R
import com.mcmouse88.taskapp.databinding.FragmentRecurringEventBinding

class RecurringEventFragment : Fragment() {

    private var _binding: FragmentRecurringEventBinding? = null
    private val binding
        get() = _binding ?: throw RuntimeException("FragmentRecurringEventBinding is null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRecurringEventBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonDoneRecurring.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}