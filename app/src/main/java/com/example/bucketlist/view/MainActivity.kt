package com.example.bucketlist.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.navigation.Navigation
import com.example.bucketlist.R
import com.example.bucketlist.base.BaseActivity
import com.example.bucketlist.databinding.ActivityMainBinding
import com.example.bucketlist.viewmodel.WorkViewModel
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, WorkViewModel>(R.layout.activity_main) {

    override val viewModel: WorkViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.d("*")
    }

    fun changeNavigation(actionId: Int) {
        val navController = Navigation.findNavController(this, R.id.fragment_container)
        navController.navigate(actionId)
    }


}