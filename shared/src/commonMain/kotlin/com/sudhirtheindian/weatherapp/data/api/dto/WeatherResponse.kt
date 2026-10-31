package com.sudhirtheindian.weatherapp.data.api.dto


import kotlinx.serialization.Serializable

@Serializable
data class WeatherResponse(
    val name: String,
    val weather: List<WeatherDto>,
    val main: MainDto,
    val wind: WindDto,
    val sys: SysDto
)