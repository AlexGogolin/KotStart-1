package org.example.Lesson_12

import java.io.PrintStream
import kotlin.random.Random

const val KELVIN_TO_CELSIUS_DIFFERENCE = 273
fun main() {
    System.setOut(PrintStream(System.`out`, true, "UTF-8"))
    var count = 1
    var weaterInfoForMounth = mutableListOf<Wheater>()
    while (count <= 30) {
        var weaterInfoForDay = Wheater((260..310).random(), (260..310).random(), Random.nextBoolean())
        weaterInfoForMounth.add(weaterInfoForDay)
        count++
    }
    val allDayTemp = weaterInfoForMounth.map { it.daytimeTemperature }
    val allNightTemp = weaterInfoForMounth.map { it.nightTemperature }
    val daysWithPrecipitation = weaterInfoForMounth.filter { it.precipitation }.size

    val dayTemp = allDayTemp.average()
    val nightTemp = allNightTemp.average()
    println("--- Статистика за месяц ---")
    println("Средняя дневная температура: ${"%.1f".format(dayTemp)}°C")
    println("Средняя ночная температура: ${"%.1f".format(nightTemp)}°C")
    println("Количество дней с осадками: $daysWithPrecipitation")
}

class Wheater(_daytimeTemperature: Int, _nightTemperature: Int, _precipitation: Boolean) {

    val daytimeTemperature: Int = _daytimeTemperature - KELVIN_TO_CELSIUS_DIFFERENCE
    val nightTemperature: Int = _nightTemperature - KELVIN_TO_CELSIUS_DIFFERENCE
    val precipitation = _precipitation
}