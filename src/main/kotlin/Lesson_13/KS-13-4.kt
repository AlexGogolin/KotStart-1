package org.example.Lesson_13

import java.io.PrintStream

fun main() {
    System.setOut(PrintStream(System.`out`, true, "UTF-8"))

    val phoneBook = mutableListOf<AnotherUserStorage3>()
    println("Внесите данные!")
    println("Ваше имя:")
    val userName = readln()
    println("Ваш номер телефона:")
    val userPhone = readln().toULongOrNull()
    println("Место работы:")
    val userCompany: String? = readln().ifBlank { null }

    if (userPhone != null) {
        val newUser = AnotherUserStorage3(userName, userPhone, userCompany)
        phoneBook.add(newUser)
        newUser.userInfo()
    } else {
        println("Введите номер телефона")
    }


}

class AnotherUserStorage3(
    val name: String,
    val phoneNumber: ULong? = null,
    val company: String? = null
) {
    fun userInfo() {
        println("Имя пользователя:$name\nНомер телефона:$phoneNumber\nМесто работы:$company")
    }
}

