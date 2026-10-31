package com.sudhirtheindian.weatherapp.data.api.dto.repository

import com.sudhirtheindian.weatherapp.data.api.WeatherApi
import com.sudhirtheindian.weatherapp.data.api.dto.mapper.toDomain
import com.sudhirtheindian.weatherapp.domain.model.Weather
import com.sudhirtheindian.weatherapp.repository.WeatherRepository


class WeatherRepositoryImpl(
    private val api: WeatherApi
) : WeatherRepository {

    override suspend fun getWeather(
        city: String
    ): Result<Weather> {

        return try {

            val response = api.getWeather(city)

            Result.success(response.toDomain())

        } catch (e: Exception) {

            Result.failure(e)
        }
    }
}