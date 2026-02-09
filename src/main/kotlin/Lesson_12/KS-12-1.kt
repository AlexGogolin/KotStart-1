package org.example.Lesson_12

import java.io.PrintStream

fun main() {
    System.setOut(PrintStream(System.`out`, true, "UTF-8"))

    val mondeyWeather = WeatherInfo()
    mondeyWeather.daytimeTemperature = 24
    mondeyWeather.nightTemperature = 12

    val fridayWeather = WeatherInfo()
    fridayWeather.daytimeTemperature = 12
    fridayWeather.nightTemperature = 6
    fridayWeather.precipitation = true
    mondeyWeather.weatherForecast()
    fridayWeather.weatherForecast()
}

class WeatherInfo() {
    var daytimeTemperature: Int = 0
    var nightTemperature: Int = 0
    var precipitation: Boolean = false

    fun weatherForecast() {
        if (!precipitation) {
            println("Дневная температура составляет $daytimeTemperature , ночная $nightTemperature, осадки не ожидаются")
        } else {
            println("Дневная температура составляет $daytimeTemperature , ночная $nightTemperature, ожидаются осадки, захватите зонт! ")
        }
    }
}