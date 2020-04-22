package com.example.pemrograman_android

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pemrograman_android.contact.Kontak
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        const val ADD_KONTAK_REQUEST = 1
        const val EDIT_KONTAK_REQUEST = 2
    }

    private lateinit var kontakViewModel: KontakViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonAddKontak.setOnClickListener {
            startActivityForResult(
                Intent(this, AddEditKontakActivity::class.java), ADD_KONTAK_REQUEST
            )
        }
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)
        val adapter = KontakAdapter()
        recycler_view.adapter = adapter
        kontakViewModel = ViewModelProviders.of(this).get(KontakViewModel::class.java)
        kontakViewModel.getAllKontak().observe(this, Observer<List<Kontak>> {
            adapter.submitList(it)
        })
        ItemTouchHelper(object :
            ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT.or(ItemTouchHelper.RIGHT)) {
            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {
                return false
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                kontakViewModel.delete(adapter.getKontakAt(viewHolder.adapterPosition))
                Toast.makeText(baseContext, "Kontak dihapus!", Toast.LENGTH_SHORT).show()
            }
        }).attachToRecyclerView(recycler_view)

        adapter.setOnItemClickListener(object : KontakAdapter.OnItemClickListener {

            // Ketika item diklik masuk ke edit dengan mengirimkan Intent
            override fun onItemClick(kontak: Kontak) {
                val intent = Intent(baseContext, AddEditKontakActivity::class.java)
                intent.putExtra(AddEditKontakActivity.EXTRA_ID, kontak.id)
                intent.putExtra(AddEditKontakActivity.EXTRA_NAMA_D, kontak.nama_d)
                intent.putExtra(AddEditKontakActivity.EXTRA_NAMA_B, kontak.nama_b)
                intent.putExtra(AddEditKontakActivity.EXTRA_NOTELP, kontak.notelp)
                intent.putExtra(AddEditKontakActivity.EXTRA_EMAIL, kontak.email)
                intent.putExtra(AddEditKontakActivity.EXTRA_CATATAN, kontak.catatan)
                intent.putExtra(AddEditKontakActivity.EXTRA_PRIORITAS, kontak.priority)
                startActivityForResult(intent, EDIT_KONTAK_REQUEST)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    // Tombol delete all diklik
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return when (item?.itemId) {
            R.id.delete_all_kontak -> {
                kontakViewModel.deleteAllKontak()
                Toast.makeText(this, "Semua kontak sudah dihapus!", Toast.LENGTH_SHORT).show()
                true
            }
            else -> {
                super.onOptionsItemSelected(item)
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == ADD_KONTAK_REQUEST && resultCode == Activity.RESULT_OK) {
            val newKontak = Kontak(
                data!!.getStringExtra(AddEditKontakActivity.EXTRA_NAMA_D),
                data.getStringExtra(AddEditKontakActivity.EXTRA_NAMA_B),
                data.getStringExtra(AddEditKontakActivity.EXTRA_NOTELP),
                data.getStringExtra(AddEditKontakActivity.EXTRA_EMAIL),
                data.getStringExtra(AddEditKontakActivity.EXTRA_CATATAN),
                data.getIntExtra(AddEditKontakActivity.EXTRA_PRIORITAS, 1)
            )
            kontakViewModel.insert(newKontak)
            Toast.makeText(this, "Kontak disimpan!", Toast.LENGTH_SHORT).show()
        } else if (requestCode == EDIT_KONTAK_REQUEST && resultCode == Activity.RESULT_OK) {
            val id = data?.getIntExtra(AddEditKontakActivity.EXTRA_ID, -1)
            if (id == -1) {
                Toast.makeText(this, "Pembaharuan gagal!", Toast.LENGTH_SHORT).show()
            }
            val updateKontak = Kontak(
                data!!.getStringExtra(AddEditKontakActivity.EXTRA_NAMA_D),
                data.getStringExtra(AddEditKontakActivity.EXTRA_NAMA_B),
                data.getStringExtra(AddEditKontakActivity.EXTRA_NOTELP),
                data.getStringExtra(AddEditKontakActivity.EXTRA_EMAIL),
                data.getStringExtra(AddEditKontakActivity.EXTRA_CATATAN),
                data.getIntExtra(AddEditKontakActivity.EXTRA_PRIORITAS, 1)
            )
            Toast.makeText(this, "Kontak diupdate!", Toast.LENGTH_SHORT).show()
            updateKontak.id = data.getIntExtra(AddEditKontakActivity.EXTRA_ID, -1)
            kontakViewModel.update(updateKontak)
        } else {
            Toast.makeText(this, "Kontak tidak disimpan!", Toast.LENGTH_SHORT).show()
        }
    }
}
