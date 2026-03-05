package org.example.Lesson_17


fun main() {

    val user = User("ivan_ivanov", "parol6")

    println("Ваш текущий пароль: ${user.password}")
    user.login = "ivan_the_great"
    user.password = "123"
    println("Пароль после попытки замены: ${user.password}")
}

class User(
    userLogin: String,
    userPassword: String,
) {
    var login = userLogin
        set(value) {
            field = value
            println("Логин изменен на $field")
        }
    var password = userPassword
        get() = "*".repeat(field.length)
        set(value) {
            println("Вы не можете изменить пароль")
        }
}