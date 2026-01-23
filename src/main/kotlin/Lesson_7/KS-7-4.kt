package org.example.Lesson_7

fun main(){
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))

    println("Сколько секунд вы хотели бы засечь?")
    val time = readln().toInt()

    for(i in time downTo 1){

        println("$i Секунд осталось: ${i-1}")
        if(i > 1){
            Thread.sleep(1000)
        }
    }
    println("Время вышло!")
}