package org.example.Lesson_10

fun main() {

    println("Придумайте логин и пароль длиной не менее 4 символов")
    do {
        val login = userLogin()
        val password = userPassword()
        if (isInputValid(login, password)) {
            println("Вы авторизованы! Ваш логин: $login , пароль: $password")
        } else {
            println("Логин или пароль недостаточно длинные, придумайте другие")
        }
    } while (!isInputValid(login, password))
}

fun userLogin(): String {
    println("Придумайте логин:")
    return readln()
}

fun userPassword(): String {
    println("Придумайте пароль:")
    return readln()
}

fun isInputValid(login: String, password: String) = login.length >= 4 && password.length >= 4