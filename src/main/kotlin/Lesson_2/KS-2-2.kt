package org.example.Lesson_2

fun main() {
    val numberOfOldWorkers: Byte = 50
    val numberOfInterns: Byte = 30
    val allWorkers: Int = numberOfOldWorkers + numberOfInterns
    val paycheckOfOldWorkers: Int = 30000
    val paycheckOfInterns: Int = 20000
    val sumPaycheckOldWorkers: Int = numberOfOldWorkers * paycheckOfOldWorkers
    val sumPaycheckInterns: Int = numberOfInterns * paycheckOfInterns
    val sumPaychecks: Int = sumPaycheckOldWorkers + sumPaycheckInterns
    val middlePaycheckOfWorkers:Int = sumPaychecks / allWorkers

    println(sumPaycheckOldWorkers)
    println(sumPaychecks)
    println(middlePaycheckOfWorkers)
}