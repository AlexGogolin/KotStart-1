package org.example.Lesson_5

fun main(){
    println("Впишите расстояние в километрах: ")
    val length = readln().toFloat()
    println("Впишите расход топлива на 100км в литрах: ")
    val petrolExpenses = readln().toFloat()
    println("Впишите цену за литр бензина: ")
    val petrolPrice = readln().toFloat()

    val quantityOfPetrol = (length * petrolExpenses) / 100
    val costOfPetrol = petrolPrice * quantityOfPetrol

    println("На данную поездку вы потратите: ${"%.2f".format(quantityOfPetrol)} литров бензина, стоимостью в : ${"%.2f".format(costOfPetrol)} руб.")
}