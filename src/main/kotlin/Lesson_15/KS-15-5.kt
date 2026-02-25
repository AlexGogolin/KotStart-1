package org.example.Lesson_15

import java.io.PrintStream
import javax.naming.Name
import kotlin.Int

fun main() {
    System.setOut(PrintStream(System.`out`, true, "UTF-8"))

    val car1 = CargoCar("Грузовик")
    val car2 = Sedan("Легковушка")
    val car3 = Sedan("Легковушка")
    val allCars: MutableList<Cars> = mutableListOf(car1, car2, car3)

    fun totalCargo() = allCars.filterIsInstance<CargoLoading>().sumOf { it.cargoCount }
    fun totalPassengers() = allCars.filterIsInstance<PassengerLoading>().sumOf { it.passengersCount }

    println("Машин на дороге: ${allCars.size}! Они везут ${totalCargo()} килограмм грузов и ${totalPassengers()} пассажиров")
    car1.loadCargo(2000)
    car1.loadPassengers(1)
    car2.loadPassengers(3)
    car3.loadPassengers(2)

    allCars.filterIsInstance<Movable>().forEach { it.movie() }

    totalCargo()
    totalPassengers()
    println("На данный момент автомобили перевозят ${totalCargo()} килограмм грузов и ${totalPassengers()} пассажиров")
}

open class Cars(
    val type: String,
)

class CargoCar(type: String) : Cars(type), CargoLoading, PassengerLoading, Movable {
    override var passengersCount: Int = 0
    override val maxPassengers: Int = 1
    override var cargoCount: Int = 0
    override val maxCargoLoad: Int = 2000
    override val currentCargo: Int? get() = cargoCount
    override val currentPassengers: Int get() = passengersCount
    override val currentType: String get() = type
}

class Sedan(
    type: String,
) : Cars(type), PassengerLoading, Movable {
    override var passengersCount: Int = 0
    override val maxPassengers: Int = 3
    override val currentCargo: Int? = null
    override val currentPassengers: Int get() = passengersCount
    override val currentType: String get() = type
}

interface CargoLoading {
    var cargoCount: Int
    val maxCargoLoad: Int
    fun loadCargo(count: Int) {
        if (cargoCount + count <= maxCargoLoad) {
            cargoCount += count
        } else {
            println("Больше не влезет")
        }
    }
}

interface PassengerLoading {
    var passengersCount: Int
    val maxPassengers: Int
    fun loadPassengers(count: Int) {
        if (passengersCount + count <= maxPassengers) {
            passengersCount += count
        } else {
            println("Мест больше нет!")
        }
    }
}

interface Movable {
    val currentCargo: Int?
    val currentPassengers: Int
    val currentType: String
    fun movie() {
        if (currentCargo != null) {
            println("Автомобиль $currentType начал движение, его загрузка $currentCargo килограмм грузов и пассажиров: $currentPassengers")
        } else {
            println("Автомобиль $currentType начал движение, везет $currentPassengers пассажиров без груза")
        }
    }
}