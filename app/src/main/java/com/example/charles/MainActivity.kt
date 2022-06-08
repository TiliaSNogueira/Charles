package com.example.charles

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.charles.repository.Repository
import com.example.charles.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)

        viewModel.getPost()

        viewModel.myresponse.observe(this, Observer { response ->
            Log.d("RESPONSE", response.userId.toString())
            Log.d("RESPONSE", response.id.toString())
            Log.d("RESPONSE", response.title)
            Log.d("RESPONSE", response.body)
        })
    }


}