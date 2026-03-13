package org.example.Lesson_19

fun main() {

    println("В аквариум вы можете добавить следующие виды рыб:")
    FishSpecies.entries.forEach { i ->
        when (i) {
            FishSpecies.GUPPY -> println("Гуппи")
            FishSpecies.GOLDFISH -> println("Золотая рыбка")
            FishSpecies.ANGELFISH -> println("Скалярия")
            FishSpecies.SIAMESE_FIGHTING_FISH -> println("Петушок")
        }
    }

}

enum class FishSpecies {
    GUPPY,
    GOLDFISH,
    ANGELFISH,
    SIAMESE_FIGHTING_FISH,
}