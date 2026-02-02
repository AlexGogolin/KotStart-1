package org.example.Lesson_10

const val LOGIN = "Owner"
const val PASSWORD = "123456"
fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))
    println("Пожалуйста авторизуйтесь, введите ваш логин и пароль:")
    val myToken = isAuthorized(readln(), readln())
    val cart = getCart(myToken)
    if (cart != null) {
        println("Ваш список товаров в корзине: $cart")
    } else {
        println("Пожалуйста авторизуйтесь!")
    }

}

fun tokenGenerator(): String {
    val token = mutableListOf<Char>()
    val allChars = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    while (token.size < 32) {
        token += allChars.random()
    }
    return token.joinToString("")
}

fun isAuthorized(userlogin: String, userpassword: String): String? {
    return if (userlogin == LOGIN && userpassword == PASSWORD) {
        tokenGenerator()
    }else null
}

fun getCart(token: String?): String? {
    val shoppingCartList = listOf("Банан", "Яблоко", "Помидоры", "Вишня", "Молоко")
    return if (token != null && token.length == 32) {
        shoppingCartList.joinToString(", ")
    } else null
}

