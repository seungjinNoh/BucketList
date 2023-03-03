package com.example.bucketlist.viewmodel

import androidx.lifecycle.viewModelScope
import com.example.bucketlist.base.BaseViewModel
import com.example.domain.model.WorkEntity
import com.example.domain.usecase.GetWorkListUseCase
import com.example.domain.usecase.InsertWorkUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class WorkViewModel @Inject constructor(
    private val getWorkListUseCase: GetWorkListUseCase,
    private val insertWorkUseCase: InsertWorkUseCase
) : BaseViewModel() {

    private val _workEvent = MutableStateFlow<WorkEvent>(WorkEvent.Empty)
    val workEvent = _workEvent.asStateFlow()

    fun getWorkList() {
        viewModelScope.launch {
            getWorkListUseCase.execute().onStart {
                Timber.d("start")
                _workEvent.value = WorkEvent.Empty
            }.catch {
                Timber.d("catch message: ${it.message}")
            }.collect {
                Timber.d("collect it: $it")
                _workEvent.value = WorkEvent.Success(it)
                Timber.d("_workEvent.value: ${_workEvent.value}")
            }
        }
    }

    fun insertWork(workEntity: WorkEntity) {
        viewModelScope.launch(Dispatchers.IO) {
            insertWorkUseCase.execute(workEntity)
        }
    }


}

sealed class WorkEvent{
    class Success(val workList: List<WorkEntity>): WorkEvent()
    class Failure(val error: Throwable?) : WorkEvent()
    object Loading : WorkEvent()
    object Empty : WorkEvent()
}
