package com.example.slimeapp.domain.usecase

import com.example.slimeapp.data.repository.UserRepository
import com.example.slimeapp.domain.entities.User
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.runBlocking
import org.junit.Test

class GetUserUseCaseTest {
    private val userRepository: UserRepository = mockk()

    private val classUnderTest = GetUserUseCase(userRepository)

    @Test
    fun `invoke with invalid email`(){
        runBlocking {
            //GIVEN
            val email = ""
            coEvery { userRepository.getUser((email)) } returns null

            //WHEN
            val result: User? = classUnderTest.invoke(email)

            //THEN
            coVerify(exactly = 1) {userRepository.getUser(email)
            assertEquals(result,null)}
        }
    }

    @Test
    fun `invoke with valid email`(){
        runBlocking {
            //GIVEN
            val email = "bol@surmesure.com"
            val exceptedUser = User("bol@surmesure.com")
            coEvery { userRepository.getUser((email)) } returns exceptedUser

            //WHEN
            val result: User? = classUnderTest.invoke(email)

            //THEN
            coVerify(exactly = 1) {userRepository.getUser(email)
                assertEquals(result,exceptedUser)}
        }
    }
}