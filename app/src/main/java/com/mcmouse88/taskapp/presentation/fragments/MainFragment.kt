package com.mcmouse88.taskapp.presentation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
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

    private fun launchHabitFragment(args: Bundle? = null) {
        binding.goToHabit.setOnClickListener {
            navController.navigate(
                R.id.action_mainFragment_to_habitFragment,
                args,
                navOptions {
                    anim {
                        enter = R.anim.slide_in_right
                        exit = R.anim.fade_out
                        popEnter = R.anim.fade_in
                        popExit = R.anim.slide_out_right
                    }
                }
            )
        }
    }

    private fun launchNewTaskFragment(args: Bundle? = null) {
        binding.goToNewTask.setOnClickListener {
            navController.navigate(
                R.id.action_mainFragment_to_newTaskFragment,
                args,
                navOptions {
                    anim {
                        enter = R.anim.slide_in_bottom
                        exit = R.anim.fade_out
                        popEnter = R.anim.fade_in
                        popExit = R.anim.slide_out_bottom
                    }
                }
            )
        }
    }

    private fun launchRecurringFragment(args: Bundle? = null) {
        binding.goToRecurring.setOnClickListener {
            navController.navigate(
                R.id.action_mainFragment_to_recurringEventFragment,
                args,
                navOptions {
                    anim {
                        enter = R.anim.slide_in_right
                        exit = R.anim.fade_out
                        popEnter = R.anim.fade_in
                        popExit = R.anim.slide_out_right
                    }
                }
            )
        }
    }

    private fun launchDetailFragment(args: Bundle? = null) {
        binding.goToDetailTask.setOnClickListener {
            navController.navigate(
                R.id.action_mainFragment_to_detailTaskFragment,
                args,
                navOptions {
                    anim {
                        enter = R.anim.slide_in_bottom
                        exit = R.anim.fade_out
                        popEnter = R.anim.fade_in
                        popExit = R.anim.slide_out_bottom
                    }
                }
            )
        }
    }

    private fun launchSettingsFragment(args: Bundle? = null) {
        binding.goToSettings.setOnClickListener {
            navController.navigate(
                R.id.action_mainFragment_to_settingsFragment,
                args,
                navOptions {
                    anim {
                        enter = R.anim.slide_in_right
                        exit = R.anim.fade_out
                        popEnter = R.anim.fade_in
                        popExit = R.anim.slide_out_right
                    }
                }
            )
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}