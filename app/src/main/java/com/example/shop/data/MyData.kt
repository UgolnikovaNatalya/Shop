package com.example.shop.data

data class MyData (
    val nameCafe: String,
    val distance : Double
        )

fun testList() : List<MyData> = listOf (
    MyData("BEDOEV COFFEE", 1.37),
    MyData("CoffeeLike", 0.8),
    MyData("Коффе есть", 1.37),
    MyData("BEDOEV COFFEE", 1.37),
    MyData("CoffeeLike", 0.8),
    MyData("Коффе есть", 1.37),
    MyData("BEDOEV COFFEE", 1.37),
    MyData("CoffeeLike", 0.8),
    MyData("Коффе есть", 1.37),

        )