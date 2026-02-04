package org.example.Lessons_1_10.Lesson_6


fun main(){
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))

    print("Введите количество секунд:")
    var userSeconds = readln().toInt()

    while(userSeconds > 0){
        println("Осталось секунд: ${userSeconds--}")
        Thread.sleep(1000)
    }
    println("Время вышло!")
}