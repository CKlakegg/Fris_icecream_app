package com.example.fris_icecream_app.ui.main.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

class AppDatabase {
    @Database(entities = [TypeObject::class], version = 1)
    abstract class AppDatabase : RoomDatabase() {
        abstract fun OderDAO(): OderDAO

        companion object {
            @Volatile
            private var INSTANCE: AppDatabase? = null

            fun getDatabase(context: Context): AppDatabase {
                return INSTANCE ?: synchronized(this) {
                    val instance = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java,
                        "app_database"
                    ).build()

                    INSTANCE = instance
                    instance
                }
            }
        }
    }
}