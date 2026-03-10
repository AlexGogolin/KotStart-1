package org.example.Lesson_18

fun main() {
    val order = Order(1)
    order.productOrdered("Молоко")
    order.productOrdered(listOf("Кофе", "Сахар", "Сливки"))
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