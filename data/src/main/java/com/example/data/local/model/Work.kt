package com.example.data.local.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.data.local.model.Work.Companion.TABLE_NAME
import kotlinx.android.parcel.Parcelize


@Parcelize
@Entity(tableName = TABLE_NAME)
data class Work(
    @ColumnInfo(name = "title")
    val title: String = "",
    @ColumnInfo(name = "contents")
    val contents: String= "",
    @PrimaryKey
    @ColumnInfo(name = PRIMARY_KEY)
    val workId: String = ""
): Parcelable {
    companion object {
        const val TABLE_NAME= "workTable"
        const val PRIMARY_KEY = "workId"
    }
}
