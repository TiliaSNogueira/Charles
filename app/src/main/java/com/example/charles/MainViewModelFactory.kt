package com.example.charles

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.charles.repository.Repository
import com.example.charles.viewmodel.MainViewModel

class MainViewModelFactory(private val repository: Repository): ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }

}