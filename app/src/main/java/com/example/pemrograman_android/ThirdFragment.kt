package com.example.pemrograman_android

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

class ThirdFragment : Fragment() {
    private var communicationViewModel: CommunicationViewModel? = null
    private var txtDesc: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        communicationViewModel =
            ViewModelProviders.of(requireActivity()).get(CommunicationViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txtDesc = view.findViewById(R.id.textViewDesc)
        //Mengubah value txtDesc.text sesuai variable desc dari comminicationViewModel
        communicationViewModel!!.desc.observe(requireActivity(),
            Observer { s -> txtDesc!!.text = s })
    }

    //Menjalankan instance fragment
    companion object {
        fun newInstance(): ThirdFragment {
            return ThirdFragment()
        }
    }
}