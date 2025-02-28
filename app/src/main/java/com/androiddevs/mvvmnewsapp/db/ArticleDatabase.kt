package com.androiddevs.mvvmnewsapp.db

import android.content.Context
import androidx.room.*
import com.androiddevs.mvvmnewsapp.models.Article

@Database(
    entities= [Article::class],
    version = 1
)

@TypeConverters(Converters:: class)
 abstract class ArticleDatabase: RoomDatabase() {
    abstract fun getArtivleDao(): ArticleDao
    companion object{
        private var instance: ArticleDatabase?=null
        private val LOCK =Any()

        operator fun invoke(context: Context)= instance?: synchronized(LOCK){
            instance?:createDatabase(context).also { instance = it}
        }
        private fun createDatabase(context: Context)=
            Room.databaseBuilder(
                context.applicationContext,
                ArticleDatabase::class.java,
                "article_db_db"
            ).build()

    }


}