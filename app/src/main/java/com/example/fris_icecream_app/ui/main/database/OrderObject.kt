package com.example.fris_icecream_app.ui.main.database

import androidx.room.Entity



@Entity(tableName = "order")
class OrderObject (
    val price:Int,
    val type: String,
    val howMany:Int)