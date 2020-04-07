package com.example.pemrograman_android

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

class FourthFragment : Fragment() {
    private var communicationViewModel: CommunicationViewModel? = null
    var url: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        communicationViewModel =
            ViewModelProviders.of(requireActivity()).get(CommunicationViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fourth, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val webView: WebView? = view.findViewById(R.id.webView)

        // Set webView
        webView!!.settings.javaScriptEnabled = true
        communicationViewModel!!.web.observe(requireActivity(), Observer { s -> url = s })

        // webView page load sesuai parameter url
        webView.loadUrl("https://$url")
    }

    //Menjalankan instance fragment
    companion object {
        fun newInstance(): FourthFragment {
            return FourthFragment()
        }
    }

}