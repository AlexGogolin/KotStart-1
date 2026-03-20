package org.example.Lesson_21

fun main() {
    val wizard = Player("John Smith", 25, 28)
    println(wizard.isHealthy())
}

fun Player.isHealthy() = health == maxHealth

class Player(
    val name: String,
    var health: Int,
    val maxHealth: Int,
)