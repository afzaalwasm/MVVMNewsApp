package com.androiddevs.mvvmnewsapp.ui.fragments

import androidx.lifecycle.ViewModel
import com.androiddevs.mvvmnewsapp.models.NewsResponse
import com.androiddevs.mvvmnewsapp.repository.NewsRepository

class NewsViewModel(
    val newRepository: NewsRepository
) : ViewModel (){
}