package org.example.Lesson_19

fun main() {

    println("В аквариум вы можете добавить следующие виды рыб:")
    FishSpecies.entries.forEach { i ->
        println(i.name)
    }

}

enum class FishSpecies {
    GUPPY,
    GOLDFISH,
    ANGELFISH,
    SIAMESE_FIGHTING_FISH,
}