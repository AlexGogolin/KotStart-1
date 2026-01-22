package org.example.Lesson_6

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))

    val loginAndPass = mutableListOf<String>()

    println("Придумайте логин:")
    val login = readln()
    loginAndPass.add(login)

    println("Создайте пароль:")
    val password = readln()
    loginAndPass.add(password)

    do {
        val repeatLoginAndPass = mutableListOf<String>()

        println("Введите логин:")
        val repeatLogin = readln()
        repeatLoginAndPass.add(repeatLogin)
        println("Введите пароль:")

        val repeatPassword = readln()
        repeatLoginAndPass.add(repeatPassword)

        val matchloginPass = repeatLoginAndPass.intersect(loginAndPass)
        val result = matchloginPass.size
    } while (result < 2)

    println("Авторизация прошла успешно")
}