package com.sudhirtheindian.weatherapp.repository

import com.sudhirtheindian.weatherapp.domain.model.Weather


interface WeatherRepository {

    suspend fun getWeather(
        city: String
    ): Result<Weather>
}