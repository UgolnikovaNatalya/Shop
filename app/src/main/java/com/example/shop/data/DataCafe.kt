package com.example.shop.data

data class DataCafe (
    val nameCafe: String,
    val distance : Double
        )

fun getDefaultCafeList() : List<DataCafe> = listOf (
    DataCafe("BEDOEV COFFEE", 1.37),
    DataCafe("CoffeeLike", 0.8),
    DataCafe("Коффе есть", 1.37),
    DataCafe("BEDOEV COFFEE", 1.37),
    DataCafe("CoffeeLike", 0.8),
    DataCafe("Коффе есть", 1.37),
    DataCafe("BEDOEV COFFEE", 1.37),
    DataCafe("CoffeeLike", 0.8),
    DataCafe("Коффе есть", 1.37),

        )