package org.example.Lesson_15

fun main() {
    val server = WeatherServer()

    val currentTemp = Temperature(22.5)
    val rain = PrecipitationAmount(10)

    server.sendReport(currentTemp)
    server.sendReport(rain)
}

abstract class WeatherStationStats

class Temperature(val value: Double) : WeatherStationStats()
class PrecipitationAmount(val amount: Int) : WeatherStationStats() {}

class WeatherServer {
    fun sendReport(info: WeatherStationStats) {
        when (info) {
            is Temperature -> println("Сервер принял данные о температуре: ${info.value}°C")
            is PrecipitationAmount -> println("Сервер принял данные об осадках: ${info.amount} мм")
        }
    }
}