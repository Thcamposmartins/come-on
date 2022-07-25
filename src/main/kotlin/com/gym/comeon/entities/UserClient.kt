package com.gym.comeon.entities

import java.time.LocalDateTime

data class UserClient (
    var id: Long,
    var name: String,
    var document: Long,
    var email: String,
    var address: Address,
    var training: String, //TODO criar class training
    var plan: Plans = Plans.DIARIO,
    var checkIn: CheckInArray,
)