package com.example.pemrograman_android

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.webkit.JsResult
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FakultasWeb : AppCompatActivity() {
    //Mengaktifkan JavaScript
    @SuppressLint("SetJavaScriptEnabled")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set Layout
        setContentView(R.layout.activity_web)

        // Set webView
        val webView = findViewById<WebView>(R.id.webView)

        // Set intent
        var intentdaridetail = intent

        //Cek apakah terdapat ACTION_VIEW Pada Intent
        if (intentdaridetail.hasExtra(Intent.ACTION_VIEW)) {
            // Ambil intent extra
            var partWeb = intentdaridetail.getStringExtra(Intent.ACTION_VIEW)
            webView.settings.javaScriptEnabled = true

            // Web client finish load -> membuat javascript alert
            webView.webViewClient = object : WebViewClient() {
                override fun onPageFinished(view: WebView, url: String) {
                    view.loadUrl("javascript:alert('Berhasil memuat website')")
                }
            }

            // Terdapat javascript alert -> toast
            webView.webChromeClient = object : WebChromeClient() {
                override fun onJsAlert(
                    view: WebView,
                    url: String,
                    message: String,
                    result: JsResult
                ): Boolean {
                    Toast.makeText(this@FakultasWeb, message, Toast.LENGTH_LONG).show()
                    result.confirm()
                    return true
                }
            }

            // webView page load sesuai parameter partWeb
            webView.loadUrl(partWeb)
        }
    }


}


