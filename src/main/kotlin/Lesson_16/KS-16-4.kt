package org.example.Lesson_16

fun main() {

    val order1 = Order(1)
    println(order1)
    order1.requestStatusChange(true)
    println(order1)
}

class Order(
    private val orderId: Int,
    private var isReady: Boolean = false,
) {
    private fun statusOfOrder(newStatus: Boolean) {
        isReady = newStatus
    }

    fun requestStatusChange(orderOfNewStatus: Boolean) {
        println("Заявка для заказа $orderId принята менеджером")
        if (orderOfNewStatus == isReady) {
            println("Заказ уже в этом статусе")
            return
        }
        println("Менеджер одобряет смену статуса для заказа №$orderId")
        statusOfOrder(orderOfNewStatus)
    }

    override fun toString(): String {
        return "Заказ №$orderId Готовность: $isReady"
    }
}