package org.example.Lesson_17


fun main() {

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
            if (field != value) {
                println("$value - имя корабля данное ему при постройке и менять его нельзя!")
            }
        }
}