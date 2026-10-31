package com.sudhirtheindian.weatherapp.data.api.dto.mapper

import com.sudhirtheindian.weatherapp.data.api.dto.WeatherResponse
import com.sudhirtheindian.weatherapp.domain.model.Weather


fun WeatherResponse.toDomain(): Weather {

    return Weather(

        city = name,

        country = sys.country,

        temperature = main.temp,

        feelsLike = main.feelsLike,

        humidity = main.humidity,

        pressure = main.pressure,

        windSpeed = wind.speed,

        description = weather.firstOrNull()?.description ?: "",

        icon = weather.firstOrNull()?.icon ?: "",

        sunrise = sys.sunrise,

        sunset = sys.sunset
    )
}