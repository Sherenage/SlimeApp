package com.example.slimeapp.presentation.main

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.View
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.slimeapp.domain.entities.User
import com.example.slimeapp.domain.usecase.CreateUserUseCase
import com.example.slimeapp.domain.usecase.GetUserUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel(
    private val createUserUseCase: CreateUserUseCase,
    private val getUserUseCase: GetUserUseCase
) : ViewModel(){

    val loginLiveData: MutableLiveData<LoginStatus> = MutableLiveData()

    fun onClickedLogin(emailUser: String, password: String){
        viewModelScope.launch(Dispatchers.IO) {
            val user: User? = getUserUseCase.invoke(emailUser, password)
            val loginStatus = if (user != null) {
                if(emailUser.equals(user.email)){
                    if(password!=user.password){
                    LoginPasswordIncorrect
                    }else{
                        LoginSuccess(user.email)
                    }
                }else{
                    LoginDontExisted
                }
             }else{
                LoginError
        }
            withContext(Dispatchers.Main) {
                loginLiveData.value = loginStatus
            }
        }
    }

     fun onClikedCreateAccount(activity: Activity) {
         viewModelScope.launch(Dispatchers.IO){
             val intent = Intent(activity, CreateAccountActivity::class.java)
             startActivity(activity,intent,null)
         }
     }
}
