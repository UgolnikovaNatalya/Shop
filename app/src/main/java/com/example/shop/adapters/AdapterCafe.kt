package com.example.shop.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shop.R
import com.example.shop.data.DataCafe

class AdapterCafe : RecyclerView.Adapter<AdapterCafe.ViewHolder>() {

    var listCafe : List<DataCafe> = emptyList()

    fun fillList (cafe : List<DataCafe>) {
        this.listCafe = cafe
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val cell = LayoutInflater.from(parent.context).inflate(R.layout.cell, parent, false)
        val cell = LayoutInflater.from(parent.context).inflate(R.layout.cell, parent, false)
        return ViewHolder(cell)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setData(listCafe[position])
    }

    override fun getItemCount(): Int = listCafe.size

    class ViewHolder (item : View) : RecyclerView.ViewHolder(item) {

        fun setData (id: DataCafe) {
            itemView.findViewById<TextView>(R.id.cafe_name).text = id.nameCafe
            itemView.findViewById<TextView>(R.id.distance_to_cafe).text = id.distance.toString()
        }

    }
}