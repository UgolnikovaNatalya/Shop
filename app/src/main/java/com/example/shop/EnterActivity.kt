package com.example.shop

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.shop.databinding.ActivityEnterBinding

class EnterActivity : AppCompatActivity() {
    val viewBinding by viewBinding(
        ActivityEnterBinding :: bind,
        R.id.root
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enter)

        viewBinding.btnLogin.setOnClickListener {
            startActivity(Intent(this, NearCafe::class.java))
        }
    }
}