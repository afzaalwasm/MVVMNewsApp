package com.androiddevs.mvvmnewsapp.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.androiddevs.mvvmnewsapp.NewsActivity
import com.androiddevs.mvvmnewsapp.R
import kotlinx.android.synthetic.main.activity_news.view.*

class SavedNewsFragment : Fragment(R.layout.fragment_saved_news){
    lateinit var viewModel:NewsViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel=(activity as NewsActivity).viewModel
    }
}