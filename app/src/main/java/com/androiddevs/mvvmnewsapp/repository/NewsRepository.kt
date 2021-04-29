package com.androiddevs.mvvmnewsapp.repository

import android.app.DownloadManager
import com.androiddevs.mvvmnewsapp.api.RetrofitInstanc
import com.androiddevs.mvvmnewsapp.db.ArticleDatabase
import com.androiddevs.mvvmnewsapp.models.Article

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstanc.api.getBreakingNews(countryCode, pageNumber)
    suspend fun searchNews(searchQuery: String, pageNumber: Int)=
        RetrofitInstanc.api.searchForNews(searchQuery, pageNumber)
    suspend fun upsert(article : Article)= db.getArtivleDao().upsert(article)
    fun getSavedNews()= db.getArtivleDao().getAllArticles()
    suspend fun deleteArticle(article: Article)= db.getArtivleDao().deleteArticle(article)
}