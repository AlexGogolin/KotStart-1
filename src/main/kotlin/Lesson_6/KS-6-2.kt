package org.example.Lesson_6


fun main(){
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))

    print("Введите количество секунд:")
    var userSeconds = readln().toInt()
    val seconds = userSeconds

    while(userSeconds > 0){
            userSeconds--
            Thread.sleep(1000)
    }
    println("Прошло $seconds секунд")
}