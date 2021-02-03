package com.example.hayalqizlarfixqi.data.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.hayalqizlarfixqi.data.model.Article

@Dao
interface ArticlesDao {

    @Query("SELECT * FROM book")
    fun getAllArticles(): List<Article>

    @Query("SELECT * FROM book WHERE id=:id")
    fun getArticleById(id: Int): Article
}