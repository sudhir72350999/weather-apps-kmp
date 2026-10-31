package com.sudhirtheindian.weatherapp.presentation.weather

import com.sudhirtheindian.weatherapp.domain.model.Weather

data class WeatherState(

    val isLoading: Boolean = false,

    val weather: Weather? = null,

    val error: String? = null,

    val city: String = "Delhi"

)