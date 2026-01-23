package org.example.Lesson_7

fun main(){
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))

    var password: String = ""

    for(i in 1..6 ){
        if(i % 2 == 0){
            val intRange = (1..9).random()
            password += intRange
        }else{
            val charRange = ('a'..'z').random()
            password += charRange
        }
    }
    println(password)
}