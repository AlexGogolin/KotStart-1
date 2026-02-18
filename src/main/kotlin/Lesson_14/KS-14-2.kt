package org.example.Lesson_14

import java.io.PrintStream

fun main() {
    System.setOut(PrintStream(System.`out`, true, "UTF-8"))

    val ship1 = CargoShip2("Грузовой", 150, 150)
    val ship2 = IceBreakerShip2("Ледокол", 150, 150)
    val ship3 = CruiseShip2("Круизный лайнер", 150, 150, 150)

    ship1.howShipLoad()
    ship1.shipDetails()
    ship2.howShipLoad()
    ship2.shipDetails()
    ship3.howShipLoad()
    ship3.shipDetails()
}

open class Ship2(
    val name: String,
    open val speed: Int,
    open val loadCapacity: Int,
    open val numberOfPassengers: Int,
    var isIceBreaker: Boolean = false,
    open var shipLoad: String = "",
) {
    open fun howShipLoad() {
        shipLoad = ""
    }

    fun shipDetails() {
        println(
            """
            Корабль: $name
            Скорость: $speed узлов
            Грузоподъемность: $loadCapacity
            Пассажиров: $numberOfPassengers
            Колет лед: ${if (isIceBreaker) "Да" else "Нет"}
            Метод погрузки: $shipLoad
        """.trimIndent()
        )
        println()
    }
}


class CargoShip2(
    name: String,
    baseSpeed: Int,
    baseCapacity: Int,
) : Ship2(name, speed = baseSpeed / 2, loadCapacity = baseCapacity * 15, 0) {
    override fun howShipLoad() {
        shipLoad = "Активирую погрузочный кран"
    }
}

class IceBreakerShip2(
    name: String,
    baseSpeed: Int,
    baseCapacity: Int,
) : Ship2(name, speed = baseSpeed / 2, loadCapacity = baseCapacity / 2, 0, isIceBreaker = true) {
    override fun howShipLoad() {
        shipLoad = "Открываю ворота со стороны кормы"
    }
}


class CruiseShip2(
    name: String,
    speed: Int,
    loadCapacity: Int,
    numberOfPassengers: Int,
) : Ship2(name, speed, loadCapacity, numberOfPassengers = numberOfPassengers * 3) {
    override fun howShipLoad() {
        shipLoad = "Выдвигаю горизонтальный трап со шкафута"
    }
}