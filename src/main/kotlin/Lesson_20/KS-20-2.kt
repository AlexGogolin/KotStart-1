package org.example.Lesson_20

fun main() {
    val healingPotion: (Player) -> Unit = { player -> player.health = player.maxHealth }
    val warrior = Player("Warrior", 28, 90)
    println(warrior.health)
    healingPotion(warrior)
    println(warrior.health)

}

class Player(
    val name: String,
    var health: Int,
    val maxHealth: Int,
)