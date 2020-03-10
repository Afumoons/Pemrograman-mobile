package com.example.pemrograman_android

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rv_list_resep.view.*

class ResepRVAdapter(
    private val resepItemList: List<ResepData>,
    private val clickListener: (ResepData) -> Unit
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    //Fungsi CreateViewHolder sesuai data yang ada pada List<ResepData>
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.rv_list_resep, parent, false)
        return PartViewHolder(view)
    }


    //Fungsi BindViewHolder
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(resepItemList[position], clickListener)
    }

    //Fungsi getItemCount
    override fun getItemCount() = resepItemList.size

    //Class PartViewHolder untuk mengubah Atribut komponen sesuai data yang ada pada List<ResepData>
    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(resep: ResepData, clickListener: (ResepData) -> Unit) {
            itemView.tv_nama.text = resep.namaResep
            itemView.tv_caption.text = resep.captionResep
            itemView.imgMakanan.setImageResource(resep.image)
            itemView.imgMakanan.contentDescription = resep.namaResep
            itemView.setOnClickListener { clickListener(resep) }
        }
    }
}