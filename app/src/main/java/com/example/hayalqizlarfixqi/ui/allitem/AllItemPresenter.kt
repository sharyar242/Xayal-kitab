package com.example.hayalqizlarfixqi.ui.allitem

import com.example.hayalqizlarfixqi.data.dao.ArticlesDao


class AllItemPresenter (private val dao: ArticlesDao, private val view: AllItemView) {
    fun getAllArticle(id: Int) {
        view.setAllArticle(dao.getArticleById(id))
    }

}