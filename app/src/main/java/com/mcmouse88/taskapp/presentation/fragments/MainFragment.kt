package com.mcmouse88.taskapp.presentation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.mcmouse88.taskapp.R
import com.mcmouse88.taskapp.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private val navController by lazy {
        findNavController()
    }

    private var _binding: FragmentMainBinding? = null
    private val binding
        get() = _binding ?: throw RuntimeException("FragmentMainBinding is null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        launchHabitFragment()
        launchRecurringFragment()
        launchDetailFragment()
        launchSettingsFragment()
        launchNewTaskFragment()
    }

    private fun launchHabitFragment() {
        binding.goToHabit.setOnClickListener {
            navController.navigate(R.id.action_mainFragment_to_habitFragment)
        }
    }

    private fun launchNewTaskFragment() {
        binding.goToNewTask.setOnClickListener {
            navController.navigate(R.id.action_mainFragment_to_newTaskFragment)
        }
    }

    private fun launchRecurringFragment() {
        binding.goToRecurring.setOnClickListener {
            navController.navigate(R.id.action_mainFragment_to_recurringEventFragment)
        }
    }

    private fun launchDetailFragment() {
        binding.goToDetailTask.setOnClickListener {
            navController.navigate(R.id.action_mainFragment_to_detailTaskFragment)
        }
    }

    private fun launchSettingsFragment() {
        binding.goToSettings.setOnClickListener {
            navController.navigate(R.id.action_mainFragment_to_settingsFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}