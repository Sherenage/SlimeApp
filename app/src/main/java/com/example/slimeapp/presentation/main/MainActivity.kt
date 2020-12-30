package com.example.slimeapp.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import com.example.slimeapp.R
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    val mainViewModel : MainViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel.loginLiveData.observe(this, Observer {
            when(it){
                is LoginSuccess -> {
                    //TODO
                }
                LoginError -> {
                    MaterialAlertDialogBuilder(this)
                        .setTitle("Error")
                        .setMessage("Unknown account")
                        .setPositiveButton("OK"){ dialog, which -> dialog.dismiss()
                        }
                        .show()
                }
                LoginPasswordIncorrect->{
                    MaterialAlertDialogBuilder(this)
                        .setTitle("Error")
                        .setMessage("Incorrect password")
                        .setPositiveButton("OK"){ dialog, which -> dialog.dismiss()
                        }
                        .show()
                }
                LoginDontExisted->{
                    MaterialAlertDialogBuilder(this)
                        .setTitle("Error")
                        .setMessage("Non-existent account")
                        .setPositiveButton("OK"){ dialog, which -> dialog.dismiss()
                        }
                        .show()
                }
            }
        })
        signIN.setOnClickListener {
            mainViewModel.onClickedLogin(login_edit.text.toString().trim(), password_edit.text.toString())
        }
        signUP.setOnClickListener {
            mainViewModel.onClikedCreateAccount(this)
            }
    }
}
