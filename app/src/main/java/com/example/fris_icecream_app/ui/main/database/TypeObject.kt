package com.example.fris_icecream_app.ui.main.database

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Type")
class TypeObject (
    val type: String,
    val price: Int,
    val amount: Int = 0,
    @PrimaryKey
    val key:String,
    val accessiblity: Double

    )