package com.sudhirtheindian.weatherapp.platform

import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.js.Js

actual fun provideEngine(): HttpClientEngine = Js.create()
