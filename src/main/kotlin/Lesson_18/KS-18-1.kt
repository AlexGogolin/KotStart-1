package org.example.Lesson_18

fun main() {
    val order1 = Order(1)
    order1.productOrdered("Молоко")
    order1.productOrdered(listOf("Кофе", "Сахар", "Сливки"))
}

class Order(
    orderId: Int,
) {
    fun productOrdered(productName: String) {
        println("«Заказан товар: ${productName}»")
    }

    fun productOrdered(listOfProducts: List<String>) {
        println("Заказаны следующие товары: ${listOfProducts.joinToString(", ")}")
    }
}