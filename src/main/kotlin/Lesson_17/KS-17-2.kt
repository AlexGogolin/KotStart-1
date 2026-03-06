package org.example.Lesson_17

import java.io.PrintStream


fun main() {
    System.setOut(PrintStream(System.`out`, true, "UTF-8"))
    val ship = Ship("Сокол тысячилетия", 500, "Альдебаран")
    println(ship.name)
    ship.name = "Ястреб тысячелетия"
    println(ship.name)

}

class Ship(
    shipName: String,
    var speed: Int,
    var homePort: String,
) {
    var name: String = shipName
        get() = field
        set(value) {
                println("$name - имя корабля данное ему при постройке и менять его нельзя!")
        }
}