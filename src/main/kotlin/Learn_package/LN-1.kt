package org.example.Learn_package

import java.io.PrintStream

fun main() {
    System.setOut(PrintStream(System.`out`, true, "UTF-8"))
    val phone = Product(
        productName = "Iphone",
        price = 10000,
        quantity = 5,
    )
    phone.SellProduct(3)
    phone.SellProduct(3)

}

class Product(
    val productName: String,
    var price: Int,
    var quantity: Int,
) {
    fun SellProduct(amount: Int) {
        if (quantity >= amount) {
            quantity -= amount
            println("Продано $amount штук, на складе осталось $quantity")
        } else {
            println("Недостаточно товара на складе!")
        }
    }
}