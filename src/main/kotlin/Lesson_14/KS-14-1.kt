package org.example.Lesson_14

import java.io.PrintStream

fun main() {
    System.setOut(PrintStream(System.`out`, true, "UTF-8"))

    val ship1 = CargoShip("Грузовой", 150, 150)
    val ship2 = IceBreakerShip("Ледокол", 150, 150)
    val ship3 = CruiseShip("Круизный лайнер", 150, 150, 150)

    ship1.shipDetails()
    ship2.shipDetails()
    ship3.shipDetails()

}

open class Ship(
    val name: String,
    open val speed: Int,
    open val loadCapacity: Int,
    open val numberOfPassengers: Int,
    var isIceBreaker: Boolean = false,
){
    fun shipDetails() {
        println("""
            Корабль: $name
            Скорость: $speed узлов
            Грузоподъемность: $loadCapacity
            Пассажиров: $numberOfPassengers
            Колет лед: ${if (isIceBreaker) "Да" else "Нет"}
        """.trimIndent())
    }
}


class CargoShip(
    name: String,
    baseSpeed: Int,
    baseCapacity: Int,
) : Ship(name, baseSpeed, baseCapacity, 0) {

    override val speed = baseSpeed / 3
    override val loadCapacity = baseCapacity * 3
}

class IceBreakerShip(
    name: String,
    baseSpeed: Int,
    baseCapacity: Int,
) : Ship(name, baseSpeed, baseCapacity, 0, isIceBreaker = true){
    override val speed = baseSpeed / 2
    override val loadCapacity = baseCapacity / 2
}


class CruiseShip(
    name: String,
    speed: Int,
    loadCapacity: Int,
    numberOfPassengers: Int,
) : Ship(name, speed, loadCapacity, numberOfPassengers){

    override val numberOfPassengers = numberOfPassengers * 3
}