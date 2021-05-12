package com.example.fris_icecream_app.ui.main.database

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Type")
class TypeObject (
    val type: String,
    val price: Int,
    @PrimaryKey
    val key:String,
    val accessiblity: Double

    )