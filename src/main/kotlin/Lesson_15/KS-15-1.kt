package org.example.Lesson_15

import java.io.PrintStream

fun main() {
    System.setOut(PrintStream(System.`out`, true, "UTF-8"))

    val karas = Fish("Карась")
    val chaika = Bird("Чайка")
    val utka = WaterBird("Утка")

    karas.howMove()
    chaika.howMove()
    utka.howMove()


}

class Fish(
    val name: String,
) : CanMoveInWater {
    fun howMove(){
        println("$name передвигается: ${moveInWater()},")
    }
}

class Bird(
    val name: String,
) : CanMoveOnWater, CanMoveInSky, CanMoveOnLand {
    fun howMove(){
        println("$name передвигается: ${moveOnWater()}, ${moveInSky()}, ${moveInLand()}")
    }

}

class WaterBird(
    val name: String,
) : CanMoveOnWater, CanMoveInWater, CanMoveInSky, CanMoveOnLand {
    fun howMove(){
        println("$name передвигается: ${moveOnWater()}, ${moveInSky()}, ${moveInLand()} и ${moveInWater()}")
    }
}


interface CanMoveOnWater {
    fun moveOnWater() = "по воде"
}

interface CanMoveInWater {
    fun moveInWater() = "в воде"
}

interface CanMoveInSky {
    fun moveInSky()= "по ввоздуху"
}

interface CanMoveOnLand {
    fun moveInLand()= "по суше"
}