package org.example.Lesson_10

const val LOGIN = "Owner"
const val PASSWORD = "123456"
fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))

    println("Пожалуйста авторизуйтесь, введите ваш логин и пароль:")
    val myToken = authorizeUser(readln(), readln())
    val cart = getCart(myToken)
    if (cart != null) {
        println("Ваш список товаров в корзине: $cart")
    } else {
        println("Пожалуйста авторизуйтесь!")
    }

}

fun generateToken(): String = buildString {
    val allChars = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    repeat(32) {
        append(allChars.random())
    }
}

fun authorizeUser(userlogin: String, userpassword: String): String? {
    return if (userlogin == LOGIN && userpassword == PASSWORD) {
        generateToken()
    } else null
}

fun getCart(token: String?): String? {
    val shoppingCartList = listOf("Банан", "Яблоко", "Помидоры", "Вишня", "Молоко")
    return if (token != null && token.length == 32) {
        shoppingCartList.joinToString(", ")
    } else null
}

