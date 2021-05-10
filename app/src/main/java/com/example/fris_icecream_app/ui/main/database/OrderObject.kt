package com.example.fris_icecream_app.ui.main.database

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "order")
class OrderObject (
    val price:Int,
    val type: String,
    val howMany:Int,
    @PrimaryKey
    val key:String,
    val accessiblity: Double

    )