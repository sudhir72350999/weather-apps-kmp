package com.sudhirtheindian.weatherapp.data.api

import com.sudhirtheindian.weatherapp.data.api.dto.WeatherResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get


class WeatherApi(
    private val client: HttpClient
) {

    suspend fun getWeather(
        city: String
    ): WeatherResponse {

        return client.get(
            ApiConstants.BASE_URL +
                    ApiConstants.WEATHER
        ) {

            url {

                parameters.append("q", city)

                parameters.append("appid", ApiConstants.API_KEY)

                parameters.append("units", "metric")
            }

        }.body()
    }
}