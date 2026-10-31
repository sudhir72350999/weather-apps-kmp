package com.sudhirtheindian.weatherapp

import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.js.Js
import web.navigator.navigator

class JsPlatform: Platform {
    private val userAgent = navigator.userAgent
    private val browserList = listOf("Chrome", "Firefox", "Safari", "Edge")

    override val name: String = userAgent.findAnyOf(browserList, ignoreCase = true)
            ?.let { (startIndex) -> userAgent.substring(startIndex).substringBefore(" ") }
            ?: "Unknown"

    override val httpClientEngine: HttpClientEngine = Js.create()
}

actual fun getPlatform(): Platform = JsPlatform()