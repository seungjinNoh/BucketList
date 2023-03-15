package com.example.bucketlist.utils

import com.example.bucketlist.application.BucketApplication

object ResourceUtils {

    fun getString(resId: Int): String {
        return BucketApplication.applicationContext().getString(resId)
    }

}