package com.example.pemrograman_android

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.pemrograman_android.contact.Kontak
import kotlinx.android.synthetic.main.kontak_item.view.*

class KontakAdapter : ListAdapter<Kontak, KontakAdapter.KontakHolder>(DIFF_CALLBACK) {
    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Kontak>() {
            // Mencari apakah item lama dan item baru sama
            override fun areItemsTheSame(oldItem: Kontak, newItem: Kontak): Boolean {
                return oldItem.id == newItem.id
            }

            // // Mencari apakah item content dan content baru di item tersebut sama
            override fun areContentsTheSame(oldItem: Kontak, newItem: Kontak): Boolean {
                return oldItem.nama_d == newItem.nama_d && oldItem.nama_b == newItem.nama_b
                        && oldItem.priority == newItem.priority && oldItem.notelp == newItem.notelp
                        && oldItem.email == newItem.email && oldItem.catatan == newItem.catatan
            }
        }
    }

    private var listener: OnItemClickListener? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KontakHolder {
        val itemView: View =
            LayoutInflater.from(parent.context).inflate(R.layout.kontak_item, parent, false)
        return KontakHolder(itemView)
    }

    override fun onBindViewHolder(holder: KontakHolder, position: Int) {
        val currentKontak: Kontak = getItem(position)
        holder.textViewNamad.text = currentKontak.nama_d
        holder.textViewNamab.text = currentKontak.nama_b
        holder.textViewNotelp.text = currentKontak.notelp
        holder.textViewEmail.text = currentKontak.email
        holder.textViewCatatan.text = currentKontak.catatan
        holder.textViewPriority.text = currentKontak.priority.toString()
    }

    fun getKontakAt(position: Int): Kontak {
        return getItem(position)
    }

    inner class KontakHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    listener?.onItemClick(getItem(position))
                }
            }
        }

        var textViewNamad: TextView = itemView.tv_nama_d
        var textViewNamab: TextView = itemView.tv_nama_b
        var textViewNotelp: TextView = itemView.tv_notelp
        var textViewEmail: TextView = itemView.tv_email
        var textViewCatatan: TextView = itemView.tv_catatan
        var textViewPriority: TextView = itemView.tv_prioritas
    }

    interface OnItemClickListener {
        fun onItemClick(kontak: Kontak)
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        this.listener = listener
    }
}