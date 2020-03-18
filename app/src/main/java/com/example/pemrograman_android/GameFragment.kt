package com.example.pemrograman_android

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.pemrograman_android.databinding.FragmentGameBinding

class GameFragment : Fragment() {
    override fun onCreateView(
        inflater:
        LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentGameBinding>(
            inflater, R.layout.fragment_game, container, false
        )
        binding.submitButton.setOnClickListener { view: View ->
            salah()
        }
        binding.submitButton2.setOnClickListener { view: View ->
            salah()
        }
        binding.submitButton3.setOnClickListener { view: View ->
            salah()
        }
        binding.submitButton4.setOnClickListener { view: View ->
            benar()
        }
        return binding.root
    }

    private fun salah() {
        view?.findNavController()?.navigate(R.id.action_gameFragment_to_gameOverFragment)
    }

    private fun benar() {
        view?.findNavController()?.navigate(R.id.action_gameFragment_to_gameFragment2)
    }
}