package com.example.pemrograman_android

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail_fakultas.*


class FakultasDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set tampilan konten ke R.layout.activity_detail_fakultas
        setContentView(R.layout.activity_detail_fakultas)

        // Set intent
        var intentdarimain = intent


        //Cek apakah terdapat EXTRA_INTENT Pada Intent
        if (intentdarimain.hasExtra(Intent.EXTRA_INTENT)) {
            //Masuk function isi tampilan
            isitampilan(intentdarimain)
        }
    }

    private fun isitampilan(intentdarimain: Intent) {
        //Inisialisasi part kiriman Intent
        var partName = intentdarimain.getStringExtra(Intent.EXTRA_INTENT)
        var partBahan = intentdarimain.getStringExtra(Intent.EXTRA_INDEX)
        var partCara = intentdarimain.getStringExtra(Intent.EXTRA_TEXT)
        var partImage =
            intentdarimain.getIntExtra(Intent.EXTRA_CHOSEN_COMPONENT, 0)
        var partEmail = intentdarimain.getStringExtra(Intent.EXTRA_EMAIL)
        var partWeb = intentdarimain.getStringExtra(Intent.EXTRA_ORIGINATING_URI)

        //Merubah attribut komponen sesuai part kiriman Intent
        tv_detail_nama.text = partName
        tv_detail_deskripsi.text = partBahan
        tv_detail_bullet.text = partCara
        tv_item_image.contentDescription = partName
        tv_item_image.setImageResource(partImage)

        if (partEmail == "") {
            tv_detail_email.text = ""
            tv_detail_label_email.text = ""
        }
        if (partWeb == "") {
            tv_detail_web.text = ""
            tv_detail_label_web.text = ""
        }

        tv_detail_web.setOnClickListener {
            //Jalankan function klikWeb dengan parameter partWeb
            klikWeb(partWeb)
        }
    }

    //Function klikWeb ketika tv_detail_web diklik -> parameter url yang akan ditampilkan
    private fun klikWeb(url: String) {
        val showWebActivity = Intent(this, FakultasWeb::class.java)

        //Kiriman Intent
        showWebActivity.putExtra(Intent.ACTION_VIEW, url)

        //Menjalankan Activity FakultasWeb dengan Intent
        startActivity(showWebActivity)
    }
}