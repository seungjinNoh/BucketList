package com.example.domain.usecase

import com.example.domain.model.WorkEntity
import com.example.domain.repository.WorkRepository
import javax.inject.Inject

class InsertWorkUseCase @Inject constructor(
    private val workRepository: WorkRepository
) {

    suspend fun execute(workEntity: WorkEntity) {
        workRepository.insertWork(workEntity)
    }

}