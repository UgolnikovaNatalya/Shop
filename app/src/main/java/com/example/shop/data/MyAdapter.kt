package com.example.shop.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shop.R

class MyAdapter : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    var myList : List<MyData> = emptyList()

    fun fillList (persons : List<MyData>) {
        this.myList = persons
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val cell = LayoutInflater.from(parent.context).inflate(R.layout.cell, parent, false)
        val cell = LayoutInflater.from(parent.context).inflate(R.layout.cell, parent, false)
        return ViewHolder(cell)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setData(myList[position])
    }

    override fun getItemCount(): Int = myList.size

    class ViewHolder (item : View) : RecyclerView.ViewHolder(item) {

        fun setData (person: MyData) {
            itemView.findViewById<TextView>(R.id.cafe_name).text = person.nameCafe
            itemView.findViewById<TextView>(R.id.distance_to_cafe).text = person.distance.toString()
        }

    }

}