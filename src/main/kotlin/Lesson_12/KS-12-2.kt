package org.example.Lesson_12

import java.io.PrintStream

fun main() {
    System.setOut(PrintStream(System.`out`, true, "UTF-8"))

    val mondeyWeather = AnotherWeatherInfo1(24, 16, true)
    mondeyWeather.weatherForecast()
}

class AnotherWeatherInfo1(var daytimeTemperature: Int, var nightTemperature: Int, var precipitation: Boolean) {

    fun weatherForecast() {
        if (!precipitation) {
            println("Дневная температура составляет $daytimeTemperature , ночная $nightTemperature, осадки не ожидаются")
        } else {
            println("Дневная температура составляет $daytimeTemperature , ночная $nightTemperature, ожидаются осадки, захватите зонт! ")
        }
    }
}