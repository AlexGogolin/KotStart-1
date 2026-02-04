package org.example.Lessons_1_10.Lesson_5

const val LOGIN: String = "Zaphod"
const val PASSWORD: String = "anGalactic"
fun main() {
    println("Ваше имя: ")
    val userName = readln()

    when(userName) {
        LOGIN -> {
            println("Здравствуйте $userName , введите пароль:")
            val userPassword = readln()
            when(userPassword) {
                PASSWORD -> println("Пользователь $userName, вам разрешено входить на борт корабля \"Heart of Gold\".")
                else -> println("Пароль неверен, попробуйте еще раз")
            }
        }else -> println("Пользователь не найден")
    }
}


