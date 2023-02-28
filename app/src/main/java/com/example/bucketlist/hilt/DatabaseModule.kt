package com.example.bucketlist.hilt

import android.content.Context
import androidx.room.Room
import com.example.data.local.dao.WorkDao
import com.example.data.local.database.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context):
            AppDatabase = Room.databaseBuilder(context, AppDatabase::class.java, "bucket_list_db").build()

    @Provides
    @Singleton
    fun provideWorkDao(appDatabase: AppDatabase): WorkDao = appDatabase.workDao()

}