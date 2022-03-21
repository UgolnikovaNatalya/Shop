package com.example.shop.data

import androidx.annotation.DrawableRes

data class DataMenu (
    val drink_name : String,
    val price : Int,
    @DrawableRes
    val photo_item : Int
        )