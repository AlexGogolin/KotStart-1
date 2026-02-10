package org.example.Lesson_13

import java.io.PrintStream

fun main(){
    System.setOut(PrintStream(System.`out`, true, "UTF-8"))

    val user = AnotherUserStorage("Ростислав", 89123456789L, "Reddit")
    val user2 = AnotherUserStorage("Bob", 89184264545L)
}

class AnotherUserStorage(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
){

    fun information(){
            val isCompany = company ?: "<Не указано>"
            println("- Имя: $name\n- Телефон: $phoneNumber\n- Компания: $isCompany")
    }
    init {
        information()
    }
}