package org.example.Lesson_18

fun main() {
    val animal1 = Dog("Рекс")
    val animal2 = Cat("Барсик")
    val animal3 = Fox("Рыжий")

    val animals: List<Animal> = listOf(animal1, animal2, animal3)

    animals.forEach {
        it.whatIsEating()
    }
}

open class Animal(
    val name: String,
    val food: String,
) {
    open fun whatIsEating() {
        println("$name ест $food")
    }
}

class Dog(
    name: String,
) : Animal(name, "Кости")

class Cat(
    name: String,
) : Animal(name, "Рыбу")

class Fox(
    name: String,
) : Animal(name, "Ягоды")