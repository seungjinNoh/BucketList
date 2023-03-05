package com.example.bucketlist.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.bucketlist.R
import com.example.bucketlist.base.BaseFragment
import com.example.bucketlist.databinding.FragmentMainBinding
import com.example.bucketlist.databinding.FragmentUpdateBinding
import com.example.bucketlist.viewmodel.WorkViewModel
import com.example.domain.model.WorkEntity
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class UpdateFragment : BaseFragment<FragmentUpdateBinding, WorkViewModel>(R.layout.fragment_update) {

    override val viewModel: WorkViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }
}