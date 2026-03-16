package org.example.Lesson_19

import java.io.PrintStream

fun main() {
    System.setOut(PrintStream(System.`out`, true, "UTF-8"))

    val people = mutableListOf<Human>()
    var counter = 1
    println("В картотеку нужно внести 5 человек.")

    while (people.size < 5) {
        println("№$counter Пожалуйста введите имя:")
        val name = readln()
        println("теперь пол: \"Мужской\" или \"Женский\"")
        val genderInput = readln()

        val gender = when (genderInput) {
            "Мужской" -> Gender.MALE
            "Женский" -> Gender.FEMALE
            else -> {
                println("Ошибка! Неверный пол. Попробуем еще раз для этого человека.")
                continue
            }
        }
        val person = Human(name, gender)
        people.add(person)
        counter++
    }

    println("Итоговый список:")
    people.forEach { println("${it.name} ${it.gender.translate}") }

}

enum class Gender(val translate: String) {
    MALE("Мужской"),
    FEMALE("Женский"),
}

class Human(
    val name: String,
    val gender: Gender,
)