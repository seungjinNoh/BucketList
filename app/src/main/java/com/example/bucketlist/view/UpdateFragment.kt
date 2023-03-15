package com.example.bucketlist.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.MutableLiveData
import com.example.bucketlist.R
import com.example.bucketlist.application.BucketApplication
import com.example.bucketlist.base.BaseFragment
import com.example.bucketlist.databinding.FragmentUpdateBinding
import com.example.bucketlist.utils.ResourceUtils
import com.example.bucketlist.viewmodel.WorkViewModel
import com.example.domain.model.WorkEntity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UpdateFragment : BaseFragment<FragmentUpdateBinding, WorkViewModel>(R.layout.fragment_update) {

    override val viewModel: WorkViewModel by viewModels()

    val liveTitle = MutableLiveData<String>()
    val liveContents = MutableLiveData<String>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = super.onCreateView(inflater, container, savedInstanceState)
        binding.fragment = this@UpdateFragment

        return view
    }

    fun checkWorkData() {
        if (liveTitle.value.isNullOrBlank()) {
            Toast.makeText(BucketApplication.applicationContext(), ResourceUtils.getString(R.string.update_title) , Toast.LENGTH_SHORT).show()
            return
        }
        if (liveContents.value.isNullOrBlank()) {
            Toast.makeText(BucketApplication.applicationContext(), ResourceUtils.getString(R.string.update_contents) , Toast.LENGTH_SHORT).show()
            return
        }

        viewModel.insertWork(
            WorkEntity(
                liveTitle.value!!,
                liveContents.value!!
            )
        )

    }

}