package com.example.slimeapp.domain.usecase

import com.example.slimeapp.data.repository.UserRepository
import com.example.slimeapp.domain.entities.User

class CreateUserUseCase(
    private val userRepository: UserRepository
) {
    suspend fun invoke(user: User){
        userRepository.createUser(user)
    }
}