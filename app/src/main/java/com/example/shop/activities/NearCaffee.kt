package com.example.shop.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.shop.R
import com.example.shop.adapters.AdapterCafe
import com.example.shop.data.getDefaultCafeList
import com.example.shop.databinding.ActivityNearCafeBinding

class NearCafe: AppCompatActivity () {
    val viewBinding by viewBinding(
        ActivityNearCafeBinding::bind,
        R.id.root
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_near_cafe)

        val adapter = AdapterCafe()
        viewBinding.recyclerView.adapter = adapter
        adapter.fillList(getDefaultCafeList())

        viewBinding.btnBack.setOnClickListener {
            onBackPressed()
        }
        viewBinding.btnMaps.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
        }
    }
}
