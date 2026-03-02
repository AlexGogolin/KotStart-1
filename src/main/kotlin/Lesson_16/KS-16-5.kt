package org.example.Lesson_16

import java.io.PrintStream

fun main() {
    System.setOut(PrintStream(System.`out`, true, "UTF-8"))

    val player1 = Player("NukeKB", 15, 345)

    player1.takeDamage(64)
    player1.healing(30)
    player1.takeDamage(500)

}

class Player(
    val playerName: String,
    var playerDamage: Int,
    private var playerHealth: Int,
) {
    private var isAlive = true

    fun takeDamage(damage: Int) {
        if (!isAlive) {
            println("$playerName мертв и уже не чувствует боли")
            return
        }
        println("$playerName получает $damage урона")
        if (playerHealth <= damage) {
            playerDeath()
            return
        }
        playerHealth -= damage
        println("Осталось здоровья: $playerHealth")
    }

    fun healing(cure: Int) {
        if (!isAlive) {
            println("Магия не действует. $playerName мертв и не может исцелиться")
            return
        }
        playerHealth += cure
        println("$playerName исцелился на $cure. Текущее здоровье: $playerHealth")
    }

    private fun playerDeath() {
        isAlive = false
        playerDamage = 0
        playerHealth = 0
        println("$playerName погиб!")
    }
}