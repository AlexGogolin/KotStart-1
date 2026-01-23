package org.example.Lesson_7

fun main(){
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))

    do {
        var secretKey = (1000..9999).random()
        println("Ваш код авторизации: $secretKey")
        println("Для авторизации напишите код:")
        var keyAnswer = readln().toInt()
        if (keyAnswer == secretKey){
            println("Вы авторизованы!")
            return
        }
    }while (keyAnswer != secretKey)
}