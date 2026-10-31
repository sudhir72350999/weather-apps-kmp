package com.sudhirtheindian.weatherapp.presentation.weather


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WeatherInfoCard(
    title: String,
    value: String
) {

    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    ) {

        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            Text(title)

            Spacer(
                Modifier.height(8.dp)
            )

            Text(
                value,
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }
}