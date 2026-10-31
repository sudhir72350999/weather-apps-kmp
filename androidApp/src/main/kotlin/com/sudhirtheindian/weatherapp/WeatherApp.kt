package com.sudhirtheindian.weatherapp

import android.app.Application
import com.sudhirtheindian.weatherapp.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class WeatherApp : Application() {
    override fun onCreate() {
        super.onCreate()

        initKoin {
            androidLogger()
            androidContext(this@WeatherApp)
        }
    }
}
