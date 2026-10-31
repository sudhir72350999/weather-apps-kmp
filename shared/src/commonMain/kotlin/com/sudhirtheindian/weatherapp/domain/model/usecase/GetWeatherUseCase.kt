package com.sudhirtheindian.weatherapp.domain.model.usecase


import com.sudhirtheindian.weatherapp.domain.model.Weather
import com.sudhirtheindian.weatherapp.repository.WeatherRepository


class GetWeatherUseCase(
    private val repository: WeatherRepository
) {

    suspend operator fun invoke(
        city: String
    ): Result<Weather> {

        return repository.getWeather(city)
    }
}