package com.example.bucketlist.hilt

import com.example.data.WorkRepositoryImpl
import com.example.data.local.dao.WorkDao
import com.example.domain.repository.WorkRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    fun provideWorkRepository(workDao: WorkDao): WorkRepository {
        return WorkRepositoryImpl(workDao)
    }


}