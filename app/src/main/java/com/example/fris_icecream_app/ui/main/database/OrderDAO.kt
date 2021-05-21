package com.example.fris_icecream_app.ui.main.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query


@Dao
interface OrderDAO {

    @Insert
    fun addItem(typeObject: TypeObject)

    @Delete
    fun deleteItem(typeObject: TypeObject)

    @Query ("SELECT * FROM Type")
    fun getAllItems(): List<TypeObject>
}