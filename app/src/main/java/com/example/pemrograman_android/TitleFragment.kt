package com.example.pemrograman_android

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.pemrograman_android.databinding.FragmentTitleBinding

class TittleFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(
            inflater,
            R.layout.fragment_title,
            container,
            false
        )
        binding.playButton.setOnClickListener { view: View ->
            view.findNavController()
                .navigate(R.id.action_titleFragment_to_gameFragment)
        }
        return binding.root
    }
}