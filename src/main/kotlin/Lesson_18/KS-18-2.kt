package org.example.Lesson_18

fun main() {

    val dice1: Dice = Tetrahedron("Четырехгранник")
    val dice2: Dice = Hexagon("Шестигранник")
    val dice3: Dice = Octahedron("Восьмигранник")

    val listOfDices: List<Dice> = listOf(dice1, dice2, dice3)
    listOfDices.forEach {
        it.rollOfDice()
    }
}

abstract class Dice(
    val type: String,
) {
    abstract fun rollOfDice()
}

class Tetrahedron(
    type: String
) : Dice(type) {
    override fun rollOfDice() {
        println("Кубик $type брошен, выпало ${(1..4).random()}")
    }
}

class Hexagon(
    type: String
) : Dice(type) {
    override fun rollOfDice() {
        println("Кубик $type брошен, выпало ${(1..6).random()}")
    }
}

class Octahedron(
    type: String
) : Dice(type) {
    override fun rollOfDice() {
        println("Кубик $type брошен, выпало ${(1..8).random()}")
    }
}