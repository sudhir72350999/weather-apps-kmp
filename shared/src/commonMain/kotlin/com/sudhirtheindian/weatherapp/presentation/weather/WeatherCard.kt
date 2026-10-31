package com.sudhirtheindian.weatherapp.presentation.weather


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sudhirtheindian.weatherapp.domain.model.Weather


@Composable
fun WeatherCard(
    weather: Weather
) {

    Card(
        modifier = Modifier.fillMaxWidth()
    ) {

        Column(
            modifier = Modifier.padding(20.dp)
        ) {

            Text(
                weather.city,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )

            Text(weather.country)

            Spacer(Modifier.height(12.dp))

            Text(
                "${weather.temperature}°C",
                fontSize = 42.sp
            )

            Spacer(Modifier.height(8.dp))

            Text(weather.description)
        }
    }
}