package com.mcmouse88.taskapp.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mcmouse88.taskapp.databinding.FragmentHabitBinding

class HabitFragment : Fragment() {

    private var _binding: FragmentHabitBinding? = null
    private val binding
        get() = _binding ?: throw RuntimeException("FragmentHabitBinding is null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHabitBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}