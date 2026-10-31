package com.sudhirtheindian.weatherapp

import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.okhttp.OkHttp

class JVMPlatform: Platform {
    override val name: String = "Java ${System.getProperty("java.version")}"

    override val httpClientEngine: HttpClientEngine = OkHttp.create()
}

actual fun getPlatform(): Platform = JVMPlatform()