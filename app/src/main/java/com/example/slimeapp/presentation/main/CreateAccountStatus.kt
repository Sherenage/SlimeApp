package com.example.slimeapp.presentation.main

sealed class CreateAccountStatus

data class AccountSuccess(val email:String):CreateAccountStatus()
object AccountExisted: CreateAccountStatus()
object AccountMissing: CreateAccountStatus()
object AccountPasswordMissing : CreateAccountStatus()
object AccountError : CreateAccountStatus()