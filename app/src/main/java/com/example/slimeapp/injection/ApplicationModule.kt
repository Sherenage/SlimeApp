package com.example.slimeapp.injection

import android.content.Context
import android.os.Build
import androidx.room.Room
import com.example.slimeapp.data.local.AppDatabase
import com.example.slimeapp.data.local.DatabaseDAO
import com.example.slimeapp.data.repository.UserRepository
import com.example.slimeapp.domain.entities.User
import com.example.slimeapp.domain.usecase.CreateUserUseCase
import com.example.slimeapp.domain.usecase.GetUserUseCase
import com.example.slimeapp.presentation.main.CreateAccountViewModel
import com.example.slimeapp.presentation.main.MainViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import java.security.AccessControlContext

val presentationModule = module {
    factory { MainViewModel(get(), get()) }
    factory { CreateAccountViewModel(get(),get()) }
}

val domainModule = module {
    factory { CreateUserUseCase(get()) }
    factory {GetUserUseCase(get()) }

}

val dataModule = module {
    single{UserRepository(get()) }
    single {createDatabase(androidContext()) }
}

fun createDatabase(context: Context): DatabaseDAO{
    val appDatabase: AppDatabase = Room.databaseBuilder(
        context,
        AppDatabase::class.java, "database-name"
    ).build()
    return appDatabase.databaseDAO()
}