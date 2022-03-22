package com.example.shop.data

import androidx.annotation.DrawableRes
import com.example.shop.R

data class DataMenu (
    val drink_name : String,
    val price : Int,
    @DrawableRes
    val photo_item : Int
        )

fun getDefaultCardList () : List <DataMenu> = listOf(
    DataMenu("Еспрессо", 200, R.drawable.ic_coffee_24),
    DataMenu("Капучино", 200, R.drawable.ic_coffee_24),
    DataMenu("Горячий шоколад", 200, R.drawable.ic_coffee_24),
    DataMenu("Латте", 200, R.drawable.ic_coffee_24),
    DataMenu("Горячий шоколад big", 350, R.drawable.ic_coffee_24),
    DataMenu("Латте big", 350, R.drawable.ic_coffee_24),
)