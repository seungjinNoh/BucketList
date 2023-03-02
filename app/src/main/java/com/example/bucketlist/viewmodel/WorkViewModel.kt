package com.example.bucketlist.viewmodel

import com.example.bucketlist.base.BaseViewModel
import com.example.domain.usecase.GetWorkListUseCase
import com.example.domain.usecase.InsertWorkUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class WorkViewModel @Inject constructor(
    private val getWorkListUseCase: GetWorkListUseCase,
    private val insertWorkUseCase: InsertWorkUseCase
) : BaseViewModel() {



}