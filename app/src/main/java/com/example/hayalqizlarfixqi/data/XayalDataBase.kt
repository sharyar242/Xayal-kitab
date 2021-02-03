package com.example.hayalqizlarfixqi.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.hayalqizlarfixqi.data.dao.ArticlesDao
import com.example.hayalqizlarfixqi.data.model.Article

@Database(entities = [Article::class], version = 1)

abstract class XayalDataBase: RoomDatabase() {

    companion object {
        private lateinit var INSTANCE : XayalDataBase

        fun getInstance(context: Context): XayalDataBase {
            if (!::INSTANCE.isInitialized) {
                INSTANCE = Room.databaseBuilder(context, XayalDataBase::class.java, "Xayal-kitabi")
                    .createFromAsset("Xayal-kitabi.db")
                    .allowMainThreadQueries()
                    .build()
            }
            return INSTANCE
        }
    }
    abstract fun articleDao(): ArticlesDao
}