package org.example.Lesson_14

import java.io.PrintStream
import kotlin.collections.forEach

fun main() {
    System.setOut(PrintStream(System.`out`, true, "UTF-8"))
    val moonX5 = Satellite("Луна-X5", false, true)
    val moonX34 = Satellite("Луна-X34", true, false)
    val magratea = Planet("Магратея", true, true, listOf(moonX5, moonX34))
    println(
        "Планета ${magratea.name}, количество спутников ${magratea.satellites.size}\n Названия спутников:\n ${
            magratea.satellites.joinToString { it.name }} "
    )
}

open class CosmicBody(
    val name: String,
    val hasAir: Boolean,
    val boardingIsPossible: Boolean,
)

class Planet(
    name: String,
    hasAir: Boolean,
    boardingIsPossible: Boolean,
    val satellites: List<Satellite> = listOf(),
) : CosmicBody(name, hasAir, boardingIsPossible)

class Satellite(
    name: String,
    hasAir: Boolean,
    boardingIsPossible: Boolean,
) : CosmicBody(name, hasAir, boardingIsPossible)
