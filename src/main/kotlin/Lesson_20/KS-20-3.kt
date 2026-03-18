package org.example.Lesson_20

fun main() {
    val openingTheDoor: (Player1) -> String = { if (it.hasKey) "Игрок открыл дверь" else "Дверь заперта" }

    val player1 = Player1(true)
    val player2 = Player1()

    println(openingTheDoor(player1))
    println(openingTheDoor(player2))
}

class Player1(
    val hasKey: Boolean = false,
)