package com.sudhirtheindian.weatherapp.data.api.dto


import kotlinx.serialization.Serializable

@Serializable
data class WeatherDto(
    val main: String,
    val description: String,
    val icon: String
)