package com.example.pemrograman_android

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testData = tambahData()
        rv_parts.layoutManager = LinearLayoutManager(this)
        rv_parts.setHasFixedSize(true)

        // Adapter untuk menampilkan item pada recycler view sesuai banyaknya data
        rv_parts.adapter =
                // Klik Resep Item -> masuk ke Class FakultasRVAdapter kirim parameter (testData, hasil dari fungsi klikResepItem)
            FakultasRVAdapter(testData) { fakultasItem: FakultasData -> klikResepItem(fakultasItem) }
    }

    //Ketika klik Resep item menerima parameter fakultasItem, masuk ke FakultasDetailActivity
    private fun klikResepItem(fakultasItem: FakultasData) {
        val showDetailActivityIntent = Intent(this, FakultasDetailActivity::class.java)

        //Kiriman Intent
        showDetailActivityIntent.putExtra(Intent.EXTRA_INTENT, fakultasItem.namaFakultas)
        showDetailActivityIntent.putExtra(Intent.EXTRA_INDEX, fakultasItem.deskripsiFakultas)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, fakultasItem.bulletFakultas)
        showDetailActivityIntent.putExtra(Intent.EXTRA_CHOSEN_COMPONENT, fakultasItem.image)
        showDetailActivityIntent.putExtra(Intent.EXTRA_EMAIL, fakultasItem.email)
        showDetailActivityIntent.putExtra(Intent.EXTRA_ORIGINATING_URI, fakultasItem.web)

        //Menjalankan Activity FakultasDetailActivity dengan Intent
        startActivity(showDetailActivityIntent)
    }


}
