package com.example.pemrograman_android

import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val BTNAdd=findViewById<ImageButton>(R.id.BTNAdd)
        BTNAdd.setOnClickListener{
            Toast.makeText(this@MainActivity,"Berhasil", Toast.LENGTH_LONG).show()}
    }
}
