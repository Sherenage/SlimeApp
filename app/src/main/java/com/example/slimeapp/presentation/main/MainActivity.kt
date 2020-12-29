package com.example.slimeapp.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import com.example.slimeapp.R
import com.example.slimeapp.presentation.main.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    val mainViewModel : MainViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonID.setOnClickListener {
            mainViewModel.onClickedUser("")
        }
        mainViewModel.text.observe(this, Observer {
            value -> textID.text = value
        })
    }
}
