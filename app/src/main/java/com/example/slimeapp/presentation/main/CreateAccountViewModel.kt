package com.example.slimeapp.presentation.main

import android.app.Activity
import android.content.Intent
import androidx.core.content.ContextCompat
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.slimeapp.domain.entities.User
import com.example.slimeapp.domain.usecase.CreateUserUseCase
import com.example.slimeapp.domain.usecase.GetUserUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class CreateAccountViewModel (
    private val createUserUseCase: CreateUserUseCase,
    private val getUserUseCase: GetUserUseCase
    ) : ViewModel(){

        val createLiveData: MutableLiveData<CreateAccountStatus> = MutableLiveData()

        fun onClickedCreate(emailUser: String, password: String){
            viewModelScope.launch(Dispatchers.IO) {
                val user = User(emailUser,password)
                createUserUseCase.invoke(user)
                val createAccountStatus = if (user != null) {
                    if(emailUser.isNotEmpty()){
                        if(password.isNotEmpty()){
                            AccountSuccess(user.email)
                        }else{
                            AccountPasswordMissing
                        }
                    }else{
                        AccountMissing
                    }
                }else{
                    AccountError
                }
                withContext(Dispatchers.Main) {
                    createLiveData.value = createAccountStatus
                }
            }
        }
    }