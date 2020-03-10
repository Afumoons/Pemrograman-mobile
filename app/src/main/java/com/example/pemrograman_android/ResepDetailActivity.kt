package com.example.pemrograman_android

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail_resep.*

class ResepDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set tampilan konten ke R.layout.activity_detail_resep
        setContentView(R.layout.activity_detail_resep)

        var intentThatStartedThisActivity = intent

        //Cek apakah terdapat EXTRA_INTENT Pada Intent
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_INTENT)) {
            //Inisialisasi part kiriman Intent
            var partName = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_INTENT)
            var partBahan = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_INDEX)
            var partCara = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT)
            var partImage =
                intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_CHOSEN_COMPONENT, 0)

            //Merubah attribut komponen sesuai part kiriman Intent
            tv_detail_nama.text = partName
            tv_detail_bahan.text = partBahan
            tv_detail_cara.text = partCara
            tv_item_image.contentDescription = partName
            tv_item_image.setImageResource(partImage)
        }
    }
}