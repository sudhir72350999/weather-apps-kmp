package com.sudhirtheindian.weatherapp

import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.js.Js

class WasmPlatform: Platform {
    override val name: String = "Web with Kotlin/Wasm"

    override val httpClientEngine: HttpClientEngine = Js.create()
}

actual fun getPlatform(): Platform = WasmPlatform()