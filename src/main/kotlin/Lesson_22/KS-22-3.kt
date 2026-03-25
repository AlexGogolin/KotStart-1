package org.example.Lesson_22

fun main() {
    val man = Person("Tom", 35, 12.7)
    val(name,age,height) = man
    println("$name,$age,$height")
}

data class Person(
    var name: String,
    var age: Int,
    var height: Double
)

