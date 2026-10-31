package com.sudhirtheindian.weatherapp.platform


import io.ktor.client.engine.*

expect fun provideEngine(): HttpClientEngine

