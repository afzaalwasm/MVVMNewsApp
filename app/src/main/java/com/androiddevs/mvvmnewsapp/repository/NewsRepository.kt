package com.androiddevs.mvvmnewsapp.repository

import com.androiddevs.mvvmnewsapp.api.RetrofitInstanc
import com.androiddevs.mvvmnewsapp.db.ArticleDatabase

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun  getBreakingNews(countryCode: String,pageNumber:Int )= RetrofitInstanc.api.getBreakingNews(countryCode, pageNumber)
}