package com.gym.comeon.api


import com.gym.comeon.entities.UserAdmin
import com.gym.comeon.entities.UserClient
import com.gym.comeon.services.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController (private var service : UserService) {

    @GetMapping("/adm")
    fun getUserAdm(): UserAdmin {
        return service.getUserAdm()
    }
    @GetMapping("/client")
    fun getUserClient(): UserClient {
        return service.getUserClient()
    }
    @GetMapping
    fun hello(): String {
        return "Hello World!"
    }
}