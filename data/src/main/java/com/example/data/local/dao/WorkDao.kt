package com.example.data.local.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.data.local.model.Work
import kotlinx.coroutines.flow.Flow

@Dao
interface WorkDao {

    @Query("SELECT * FROM ${Work.TABLE_NAME}")
    fun getAllWork(): Flow<List<Work>>

}