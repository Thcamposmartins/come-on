package com.gym.comeon.entities

import java.time.LocalDateTime


data class CheckInArray (
    //criar array com entradas e saidas do usuario
    var IO: LocalDateTime? = LocalDateTime.now()
    )
