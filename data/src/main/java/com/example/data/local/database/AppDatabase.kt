package com.example.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.data.local.dao.WorkDao
import com.example.data.local.model.Work

@Database(entities = [Work::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun workDao(): WorkDao


}