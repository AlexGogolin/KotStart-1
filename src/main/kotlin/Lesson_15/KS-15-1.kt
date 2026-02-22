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
) : Waterfowl {
    fun howMove() {
        println("$name ${moveInWater()}")
    }
}

class Bird(
    val name: String,
) : Flyable {
    fun howMove() {
        println("$name ${moveOnSky()} ")
    }

}

class WaterBird(
    val name: String,
) : Flyable, Waterfowl {
    fun howMove() {
        println("$name ${moveOnSky()} и ${moveInWater()}")
    }
}


interface Flyable {
    fun moveOnSky() = "летает"
}

interface Waterfowl {
    fun moveInWater() = "плавает"
}

