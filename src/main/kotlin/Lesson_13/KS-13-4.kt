package org.example.Lesson_13

import java.io.PrintStream

fun main() {
    System.setOut(PrintStream(System.`out`, true, "UTF-8"))

    val phoneBook = mutableListOf<AnotherUserStorage3>()
    while (true) {
        println("Ваше имя:")
        val userName = readln()
        if (userName.isBlank()) {
            break
        }
        println("Ваш номер телефона:")
        val userPhone = readln().toLongOrNull()
        if (userPhone != null) {
            println("Место работы:")
            val userCompany: String? = readln().ifBlank { null }
            val newUser = AnotherUserStorage3(userName, userPhone, userCompany)
            phoneBook.add(newUser)
            newUser.userInfo()
        } else {
            println("Вы не ввели номер телефона, учетная запись не будет добавлена, попробуйте еще раз!")
        }
    }
    println("-- Итоговый список контактов --")
    phoneBook.forEach { it.userInfo() }
}

class AnotherUserStorage3(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun userInfo() {
        println("\nКонтакт: \nИмя пользователя:$name\nНомер телефона:$phoneNumber\nМесто работы:$company")
    }
}

