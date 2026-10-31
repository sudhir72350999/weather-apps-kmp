package com.sudhirtheindian.weatherapp.di

import com.sudhirtheindian.weatherapp.data.api.HttpClientFactory
import com.sudhirtheindian.weatherapp.data.api.WeatherApi
import com.sudhirtheindian.weatherapp.data.api.dto.repository.WeatherRepositoryImpl
import com.sudhirtheindian.weatherapp.domain.model.usecase.GetWeatherUseCase
import com.sudhirtheindian.weatherapp.presentation.weather.WeatherViewModel
import com.sudhirtheindian.weatherapp.repository.WeatherRepository
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module
import org.koin.core.module.dsl.viewModel

val networkModule = module {

    single {
        HttpClientFactory.create()
    }

    single {
        WeatherApi(get())
    }

    single<WeatherRepository> {
        WeatherRepositoryImpl(get())
    }
}

val appModule = module {
    single { GetWeatherUseCase(get()) }
    viewModel { WeatherViewModel(get()) }
}

fun initKoin(config: KoinAppDeclaration? = null) {
    startKoin {
        config?.invoke(this)
        modules(networkModule, appModule)
    }
}
