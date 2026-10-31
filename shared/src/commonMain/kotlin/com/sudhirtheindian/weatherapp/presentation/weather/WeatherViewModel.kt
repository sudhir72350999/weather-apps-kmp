package com.sudhirtheindian.weatherapp.presentation.weather


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sudhirtheindian.weatherapp.domain.model.usecase.GetWeatherUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class WeatherViewModel(
    private val getWeather: GetWeatherUseCase
) : ViewModel() {

    private val _state = MutableStateFlow(WeatherState())

    val state: StateFlow<WeatherState> = _state.asStateFlow()

    init {
        loadWeather("Delhi")
    }

    fun onEvent(event: WeatherEvent) {

        when (event) {

            is WeatherEvent.Search -> {
                loadWeather(event.city)
            }

            WeatherEvent.Refresh -> {
                loadWeather(_state.value.city)
            }
        }
    }

    private fun loadWeather(city: String) {

        viewModelScope.launch {

            _state.update {
                it.copy(
                    isLoading = true,
                    error = null
                )
            }

            val result = getWeather(city)

            result.onSuccess { weather ->

                _state.update {

                    it.copy(
                        isLoading = false,
                        weather = weather,
                        city = city
                    )
                }

            }.onFailure { exception ->

                _state.update {

                    it.copy(
                        isLoading = false,
                        error = exception.message ?: "Unknown Error"
                    )
                }

            }
        }
    }
}