package com.sudhirtheindian.weatherapp.data.api.dto


import kotlinx.serialization.Serializable

@Serializable
data class SysDto(
    val country: String,
    val sunrise: Long,
    val sunset: Long
)