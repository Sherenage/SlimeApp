package com.example.slimeapp.data.repository

import com.example.slimeapp.data.local.AppDatabase
import com.example.slimeapp.data.local.DatabaseDAO
import com.example.slimeapp.data.local.models.UserLocal
import com.example.slimeapp.data.local.models.toData
import com.example.slimeapp.data.local.models.toEntity
import com.example.slimeapp.domain.entities.User

class UserRepository(
    private val databaseDAO: DatabaseDAO) {
    suspend fun createUser(user: User){
        databaseDAO.insert(user.toData())
    }

    fun getUser(email: String): User? {
        val userLocal:UserLocal? = databaseDAO.findByName(email)
        return userLocal?.toEntity()
    }
}