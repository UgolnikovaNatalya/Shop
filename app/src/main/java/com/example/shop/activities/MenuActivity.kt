package com.example.shop.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.shop.R
import com.example.shop.adapters.AdapterMenu
import com.example.shop.data.getDefaultCardList
import com.example.shop.databinding.ActivityMenuBinding

class MenuActivity :AppCompatActivity() {
    val vb by viewBinding(
        ActivityMenuBinding::bind,
        R.id.roots
    )

    private val adapter = AdapterMenu()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)


        vb.recyclerViewMenu.adapter = adapter
        adapter.fillMenuList(getDefaultCardList())
    }
}