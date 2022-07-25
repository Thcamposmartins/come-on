package com.gym.comeon.services

import com.gym.comeon.entities.*
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService (private var user : List<UserAdmin>){
    init {
        val userAdm =  UserAdmin(
            id = 1,
            name = "Thaís",
            document = 11111,
            email = "thais@getin.com",
        )
        user = Arrays.asList(userAdm,userAdm,userAdm)//repetido para teste array
    }

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

    //varre uma lista de usuarios buscando o id = paramentro
    fun getForId(id:Number):UserAdmin{
        return user.stream().filter { t ->
            t.id == id
        }.findFirst().get()
    }
}