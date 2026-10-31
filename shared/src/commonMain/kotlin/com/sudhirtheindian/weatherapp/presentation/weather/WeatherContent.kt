package com.sudhirtheindian.weatherapp.presentation.weather


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sudhirtheindian.weatherapp.domain.model.Weather

@Composable
fun WeatherContent(
    weather: Weather,
    onRefresh: () -> Unit
) {

    Column {

        WeatherCard(weather)

        Spacer(Modifier.height(20.dp))

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier.height(250.dp)
        ) {

            item {

                WeatherInfoCard(
                    title = "Humidity",
                    value = "${weather.humidity}%"
                )
            }

            item {

                WeatherInfoCard(
                    title = "Wind",
                    value = "${weather.windSpeed} km/h"
                )
            }

            item {

                WeatherInfoCard(
                    title = "Pressure",
                    value = "${weather.pressure}"
                )
            }

            item {

                WeatherInfoCard(
                    title = "Feels Like",
                    value = "${weather.feelsLike}°C"
                )
            }
        }

        Spacer(Modifier.height(20.dp))

        Button(
            onClick = onRefresh,
            modifier = Modifier.fillMaxWidth()
        ) {

            Text("Refresh")
        }
    }
}