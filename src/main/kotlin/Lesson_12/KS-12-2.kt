package org.example.Lesson_12

import java.io.PrintStream

fun main() {
    System.setOut(PrintStream(System.`out`, true, "UTF-8"))

    val mondeyWeather = AnotherWeatherInfo(24, 16, true)
    mondeyWeather.weatherForecast()
}

class AnotherWeatherInfo(_daytimeTemperature: Int, _nighttemperature: Int, _precipitation: Boolean) {
    var daytimeTemperature: Int = _daytimeTemperature
    var nightTemperature: Int = _nighttemperature
    var precipitation: Boolean = _precipitation

    fun weatherForecast() {
        if (!precipitation) {
            println("Дневная температура составляет $daytimeTemperature , ночная $nightTemperature, осадки не ожидаются")
        } else {
            println("Дневная температура составляет $daytimeTemperature , ночная $nightTemperature, ожидаются осадки, захватите зонт! ")
        }
    }
}