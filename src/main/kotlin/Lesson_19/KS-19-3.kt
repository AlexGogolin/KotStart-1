package org.example.Lesson_19


fun main() {

    val ship = SpaceShip()

    ship.takeOff()
    ship.land()
    ship.shootAsteroid()
}

class SpaceShip {
    fun takeOff() {
        // TODO будет функционал взлета
    }

    fun land() {
        println("Корабль приземлился")
    }

    fun shootAsteroid() {
        TODO("Нужна логика стрельбы и урона")
    }
}