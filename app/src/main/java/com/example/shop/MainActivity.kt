package com.example.shop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.shop.databinding.ActivityRegistryBinding

class MainActivity : AppCompatActivity() {
    val viewBinding by viewBinding (
        ActivityRegistryBinding::bind,
        R.id.root
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //custom toolbar
        supportActionBar!!.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM)
        supportActionBar!!.setCustomView(R.layout.toolbar_registy)

        setContentView(R.layout.activity_registry)
    }
}