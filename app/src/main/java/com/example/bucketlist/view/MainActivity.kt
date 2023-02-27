package com.example.bucketlist.view

import android.os.Bundle
import androidx.activity.viewModels
import com.example.bucketlist.R
import com.example.bucketlist.base.BaseActivity
import com.example.bucketlist.databinding.ActivityMainBinding
import com.example.bucketlist.viewmodel.BucketListViewModel
import timber.log.Timber

class MainActivity : BaseActivity<ActivityMainBinding, BucketListViewModel>(R.layout.activity_main) {

    override val viewModel: BucketListViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.d("*")
    }
}