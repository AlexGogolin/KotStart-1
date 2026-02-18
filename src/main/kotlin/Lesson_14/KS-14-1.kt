package org.example.Lesson_14

import java.io.PrintStream

fun main() {
    System.setOut(PrintStream(System.`out`, true, "UTF-8"))

    val ship1 = CargoShip("Грузовой")
    val ship2 = IceBreakerShip("Ледокол")
    val ship3 = CruiseShip("Круизный лайнер")

    ship1.shipDetails()
    ship2.shipDetails()
    ship3.shipDetails()

}

open class Ship(
    open val name: String,
    val speed: Int?,
    val loadCapacity: Int?,
    val numberOfPassengers: Int?,
    var isIceBreaker: Boolean = false,
) {
    fun shipDetails() {
        println(
            """
            Корабль: $name
            Скорость: $speed узлов
            Грузоподъемность: $loadCapacity
            Пассажиров: $numberOfPassengers
            Колет лед: ${if (isIceBreaker) "Да" else "Нет"}
        """.trimIndent()
        )
        println()
    }
}


class CargoShip(
    override val name: String,
) : Ship(
    name = name,
    speed = 15,
    loadCapacity = 1500,
    numberOfPassengers = 10,
)

class IceBreakerShip(
    override val name: String,
) : Ship(
    name = name,
    speed = 150,
    loadCapacity = 500,
    numberOfPassengers = 10,
    isIceBreaker = true,
)


class CruiseShip(
    override val name: String,
) : Ship(
    name = name,
    speed = 150,
    loadCapacity = 500,
    numberOfPassengers = 1500,
)