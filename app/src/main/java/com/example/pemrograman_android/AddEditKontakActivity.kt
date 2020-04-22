package com.example.pemrograman_android

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_add_kontak.*

class AddEditKontakActivity : AppCompatActivity() {
    companion object {
        // Membuat variabel untuk extra intent
        const val EXTRA_ID = "com.example.pemrograman_android.EXTRA_ID"
        const val EXTRA_NAMA_D = "com.example.pemrograman_android.EXTRA_NAMA_D"
        const val EXTRA_NAMA_B = "com.example.pemrograman_android.EXTRA_NAMA_B"
        const val EXTRA_NOTELP = "com.example.pemrograman_android.EXTRA_NOTELP"
        const val EXTRA_EMAIL = "com.example.pemrograman_android.EXTRA_EMAIL"
        const val EXTRA_CATATAN = "com.example.pemrograman_android.EXTRA_CATATAN"
        const val EXTRA_PRIORITAS = "com.example.pemrograman_android.EXTRA_PRIORITAS"
    }

    // Mengatur prioritas kontak
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_kontak)
        number_picker_priority.minValue = 1
        number_picker_priority.maxValue = 5
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_close_white_24dp)

        // Menampilkan menu layout ketika edit berdasarkan Intent
        if (intent.hasExtra(EXTRA_ID)) {
            title = "Edit Catatan"
            ti_nama_d.setText(intent.getStringExtra(EXTRA_NAMA_D))
            ti_nama_b.setText(intent.getStringExtra(EXTRA_NAMA_B))
            ti_notelp.setText(intent.getStringExtra(EXTRA_NOTELP))
            ti_email.setText(intent.getStringExtra(EXTRA_EMAIL))
            ti_catatan.setText(intent.getStringExtra(EXTRA_CATATAN))
            number_picker_priority.value = intent.getIntExtra(EXTRA_PRIORITAS, 1)
        } else {
            title = "Tambah Catatan"
        }
    }

    // Menampilkan halaman menu tambah kontak baru
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.add_kontak_menu, menu)
        return true
    }

    // Memanggil kontak berdasaran id
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return when (item?.itemId) {
            R.id.save_kontak -> {
                saveKontak()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    // Menyimpan kontak
    private fun saveKontak() {
        if (ti_nama_d.text.toString().trim().isBlank() || ti_notelp.text.toString().trim().isBlank()) {
            Toast.makeText(this, "Catatan kosong!", Toast.LENGTH_SHORT).show()
            return
        }
        val data = Intent().apply {
            putExtra(EXTRA_NAMA_D, ti_nama_d.text.toString())
            putExtra(EXTRA_NAMA_B, ti_nama_b.text.toString())
            putExtra(EXTRA_NOTELP, ti_notelp.text.toString())
            putExtra(EXTRA_EMAIL, ti_email.text.toString())
            putExtra(EXTRA_CATATAN, ti_catatan.text.toString())
            putExtra(EXTRA_PRIORITAS, number_picker_priority.value)
            if (intent.getIntExtra(EXTRA_ID, -1) != -1) {
                putExtra(EXTRA_ID, intent.getIntExtra(EXTRA_ID, -1))
            }
        }
        setResult(Activity.RESULT_OK, data)
        finish()
    }
}