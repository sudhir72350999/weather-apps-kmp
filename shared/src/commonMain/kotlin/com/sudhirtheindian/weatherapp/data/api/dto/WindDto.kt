package com.sudhirtheindian.weatherapp.data.api.dto


import kotlinx.serialization.Serializable

@Serializable
data class WindDto(
    val speed: Double
)