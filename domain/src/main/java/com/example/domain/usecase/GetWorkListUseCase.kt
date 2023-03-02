package com.example.domain.usecase

import com.example.domain.model.WorkEntity
import com.example.domain.repository.WorkRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetWorkListUseCase @Inject constructor(
    private val workRepository: WorkRepository
) {

    suspend fun execute(): Flow<List<WorkEntity>> = workRepository.getWorkList()
}