package org.example.Lesson_10

fun main() {

    println("Придумайте логин и пароль длиной не менее 4 символов")
    do {
        val login = userLogin()
        val password = userPassword()
        val isValid = userLoginAndPass(login, password)
        if (isValid) {
            println("Вы авторизованы! Ваш логин: $login , пароль: $password")
        } else {
            println("Логин или пароль недостаточно длинные, придумайте другие")
        }
    } while (!isValid)
}

fun userLogin(): String {
    println("Придумайте логин:")
    return readln()
}

fun userPassword(): String {
    println("Придумайте пароль:")
    return readln()
}

fun userLoginAndPass(login: String, password: String): Boolean {
    return login.length >= 4 || password.length >= 4
}