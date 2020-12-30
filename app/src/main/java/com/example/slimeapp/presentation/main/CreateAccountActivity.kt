package com.example.slimeapp.presentation.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.slimeapp.R
import androidx.lifecycle.Observer
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.android.synthetic.main.activity_create_account.*

import org.koin.android.ext.android.inject

class CreateAccountActivity : AppCompatActivity() {

    val createAccountViewModel : CreateAccountViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        createAccountViewModel.createLiveData.observe(this, Observer {
            when(it){
                is AccountSuccess -> {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    val toast = Toast.makeText(this, "Welcome newcomer !", Toast.LENGTH_SHORT)
                    toast.show()
                }
                AccountError -> {
                    MaterialAlertDialogBuilder(this)
                        .setTitle("Error")
                        .setMessage("empty text fields")
                        .setPositiveButton("OK"){ dialog, which -> dialog.dismiss()
                        }
                        .show()
                }
                AccountMissing -> {
                    MaterialAlertDialogBuilder(this)
                        .setTitle("Error")
                        .setMessage("Please enter an email")
                        .setPositiveButton("OK"){ dialog, which -> dialog.dismiss()
                        }
                        .show()
                }
                AccountPasswordMissing -> {
                    MaterialAlertDialogBuilder(this)
                        .setTitle("Error")
                        .setMessage("Please enter a password")
                        .setPositiveButton("OK"){ dialog, which -> dialog.dismiss()
                        }
                        .show()
                }
            }
        })
        signUP.setOnClickListener {
            createAccountViewModel.onClickedCreate(login_edit.text.toString().trim(), password_edit.text.toString())
        }
    }
}
