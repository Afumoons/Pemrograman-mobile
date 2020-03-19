package com.example.pemrograman_android

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rv_list_fakultas.view.*

class FakultasRVAdapter(
    private val fakultasItemList: List<FakultasData>,
    private val clickListener: (FakultasData) -> Unit
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    //Fungsi CreateViewHolder sesuai data yang ada pada List<FakultasData>
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.rv_list_fakultas, parent, false)
        return PartViewHolder(view)
    }

    //Fungsi BindViewHolder
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(fakultasItemList[position], clickListener)
    }

    //Fungsi getItemCount
    override fun getItemCount() = fakultasItemList.size

    //Class PartViewHolder untuk mengubah Atribut komponen sesuai data yang ada pada List<FakultasData>
    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(fakultas: FakultasData, clickListener: (FakultasData) -> Unit) {
            itemView.tv_nama.text = fakultas.namaFakultas
            itemView.imgMakanan.setImageResource(fakultas.image)
            itemView.imgMakanan.contentDescription = fakultas.namaFakultas
            itemView.setOnClickListener { clickListener(fakultas) }
        }
    }
}