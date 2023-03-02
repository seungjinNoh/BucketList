package com.example.domain.repository

import com.example.domain.model.WorkEntity
import kotlinx.coroutines.flow.Flow

interface WorkRepository {

    suspend fun getWorkList(): Flow<List<WorkEntity>>
    suspend fun insertWork(work: WorkEntity)

}