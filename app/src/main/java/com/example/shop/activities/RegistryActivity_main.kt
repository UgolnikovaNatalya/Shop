package com.example.shop.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.shop.R
import com.example.shop.databinding.ActivityRegistryBinding

class RegistryActivity_main : AppCompatActivity() {
    val viewBinding by viewBinding (
        ActivityRegistryBinding::bind,
        R.id.root
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_registry)

        viewBinding.btnLogin.setOnClickListener {
            startActivity(Intent(this, EnterActivity::class.java))
        }
    }
}