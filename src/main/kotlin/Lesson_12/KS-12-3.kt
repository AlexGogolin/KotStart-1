package org.example.Lesson_12

import java.io.PrintStream
const val KELVIN_TO_CELSIUS_DIFFERENCE = 273
fun main() {
    System.setOut(PrintStream(System.`out`, true, "UTF-8"))

    val mondeyWeather = AnotherWeatherInfo2( 290, 285, true)
    mondeyWeather.weatherForecast()
}

class AnotherWeatherInfo2(_daytimeTemperature: Int, _nightTemperature: Int, _precipitation: Boolean) {

    var daytimeTemperature: Int = _daytimeTemperature - KELVIN_TO_CELSIUS_DIFFERENCE
    var nightTemperature: Int = _nightTemperature - KELVIN_TO_CELSIUS_DIFFERENCE
    var precipitation= _precipitation
    fun weatherForecast() {
        if (!precipitation) {
            println("Дневная температура составляет $daytimeTemperature, ночная $nightTemperature, осадки не ожидаются")
        } else {
            println("Дневная температура составляет $daytimeTemperature, ночная $nightTemperature, ожидаются осадки, захватите зонт! ")
        }
    }
}