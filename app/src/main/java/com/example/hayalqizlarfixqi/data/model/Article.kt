package com.example.hayalqizlarfixqi.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "book")

class Article (

    @PrimaryKey
    val id: Int,

    @PrimaryKey
    val type: Int,

    @ColumnInfo(name = "article")
    val article: String

)