package com.example.slimeapp.Injection

import com.example.slimeapp.MainViewModel
import org.koin.dsl.module

val presentationModule = module {
    factory { MainViewModel() }
}