package com.example.slimeapp.presentation.main

sealed class LoginStatus

data class LoginSuccess(val email:String): LoginStatus()
object LoginError: LoginStatus()
object LoginPasswordIncorrect : LoginStatus()
object LoginDontExisted: LoginStatus()
