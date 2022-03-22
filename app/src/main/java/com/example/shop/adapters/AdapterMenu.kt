package com.example.shop.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.*
import com.example.shop.R
import com.example.shop.data.DataMenu
import java.util.zip.Inflater

class AdapterMenu : RecyclerView.Adapter<AdapterMenu.ViewHolder>() {

    var menuList : List <DataMenu> = emptyList()

    fun fillMenuList (item : List<DataMenu>){
        this.menuList = item
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val card = LayoutInflater.from(parent.context).inflate(R.layout.card, parent, false)
        return ViewHolder(card)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setDataMenu(menuList[position])
       }


    override fun getItemCount(): Int =menuList.size


     class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        fun setDataMenu (id : DataMenu){
            itemView.findViewById<TextView>(R.id.coffee_name).text = id.drink_name
            itemView.findViewById<TextView>(R.id.price).text = id.price.toString()
            val image = ContextCompat.getDrawable(itemView.context, id.photo_item)
            itemView.findViewById<ImageView>(R.id.image).setImageDrawable(image)
        }
    }
}