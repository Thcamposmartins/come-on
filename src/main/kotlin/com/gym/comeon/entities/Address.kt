package com.gym.comeon.entities

data class Address (
    var street : String,
    var city : String,
    var state : String,
    var zipCode : String,
    var country : String,
    var complement : String? = null
    )

