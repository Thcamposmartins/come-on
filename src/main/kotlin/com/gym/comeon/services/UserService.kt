package com.gym.comeon.services

import com.gym.comeon.entities.*
import org.springframework.stereotype.Service

@Service
class UserService (){

    fun getUserAdm(): UserAdmin {
        return UserAdmin(
            id = 1,
            name = "Thaís",
            document = 11111,
            email = "thais@getin.com",
        )
    }

    fun getUserClient(): UserClient {
        return UserClient(
            id = 1,
            name = "User",
            document = 22222,
            email = "user@getin.com",
            address = Address(
                "Rua nova",
                "Arcos",
                "Minas Gerais",
                "35588-000",
                "Brasil"
            ),
            training = "ABC",
            plan = Plans.DIARIO,
            checkIn = CheckInArray()
        )
    }
}