package com.example.data

import com.example.data.local.dao.WorkDao
import com.example.data.local.model.Work
import com.example.domain.model.WorkEntity
import com.example.domain.repository.WorkRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class WorkRepositoryImpl(private val workDao: WorkDao) : WorkRepository {

    override suspend fun getWorkList(): Flow<List<WorkEntity>> {
        val list = listOf<WorkEntity>(WorkEntity("testId", "testTitle", "testContents"))
        return flow {
            emit(list)
        }
    }

    override suspend fun insertWork(workEntity: WorkEntity) {
        val work = Work(workEntity.workId, workEntity.title, workEntity.contents)
        workDao.insert(work = work)
    }
}