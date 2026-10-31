package com.sudhirtheindian.weatherapp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.sudhirtheindian.weatherapp.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "WeatherApp",
        ) {
            App()
        }
    }
}
