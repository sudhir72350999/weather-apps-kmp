package com.sudhirtheindian.weatherapp.presentation.weather


sealed interface WeatherEvent {

    data class Search(
        val city: String
    ) : WeatherEvent

    data object Refresh : WeatherEvent
}