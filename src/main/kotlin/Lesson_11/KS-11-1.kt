package org.example.Lesson_11

fun main() {

    val user1 = User(
        id = 1,
        login = "Alberto",
        password = "1234567",
        email = "alberto@mail.com",
    )

    val user2 = User(
        id = 2,
        login = "Pepe",
        password = "qwerty",
        email = "lama@mail.com",
    )

    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.email)
    println()
    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.email)
}