package com.example.slimeapp.domain.usecase

import com.example.slimeapp.data.repository.UserRepository
import com.example.slimeapp.domain.entities.User

class GetUserUseCase(
    private val userRepository: UserRepository
) {
    suspend fun invoke(email: String): User? {
       return userRepository.getUser(email)
    }
}