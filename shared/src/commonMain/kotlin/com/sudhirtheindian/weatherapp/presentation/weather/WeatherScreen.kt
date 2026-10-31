package com.sudhirtheindian.weatherapp.presentation.weather

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.koin.compose.koinInject
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun WeatherScreen(
    viewModel: WeatherViewModel = koinViewModel()
) {

    val state by viewModel.state.collectAsState()

    var city by remember {
        mutableStateOf(state.city)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        SearchBar(

            value = city,

            onValueChange = {
                city = it
            },

            onSearch = {
                viewModel.onEvent(
                    WeatherEvent.Search(city)
                )
            }
        )

        Spacer(Modifier.height(20.dp))

        when {

            state.isLoading -> {

                LoadingView()
            }

            state.error != null -> {

                Text(
                    text = state.error!!,
                    color = MaterialTheme.colorScheme.error
                )
            }

            state.weather != null -> {

                WeatherContent(
                    weather = state.weather!!,
                    onRefresh = {
                        viewModel.onEvent(
                            WeatherEvent.Refresh
                        )
                    }
                )
            }
        }
    }
}