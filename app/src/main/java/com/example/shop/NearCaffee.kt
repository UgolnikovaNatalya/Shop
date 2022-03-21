package com.example.shop

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.shop.data.MyAdapter
import com.example.shop.data.testList
import com.example.shop.databinding.ActivityNearCafeBinding

class NearCafe: AppCompatActivity () {
    val viewBinding by viewBinding(
        ActivityNearCafeBinding::bind,
        R.id.root
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_near_cafe)

        val adapter = MyAdapter()
        viewBinding.recyclerView.adapter = adapter
        adapter.fillList(testList())

        viewBinding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}
