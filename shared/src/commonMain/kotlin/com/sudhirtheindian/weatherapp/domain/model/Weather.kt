package com.sudhirtheindian.weatherapp.domain.model


data class Weather(
    val city: String,
    val country: String,
    val temperature: Double,
    val feelsLike: Double,
    val humidity: Int,
    val pressure: Int,
    val windSpeed: Double,
    val description: String,
    val icon: String,
    val sunrise: Long,
    val sunset: Long
)