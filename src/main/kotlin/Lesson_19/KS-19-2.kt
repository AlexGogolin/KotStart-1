package org.example.Lesson_19

fun main() {

    val shirt = Product(1234, "Белая рубашка", Category.DRESS)
    val pen = Product(2345, "Ручка синяя", Category.OFFICE_SUPPLIES)
    val box = Product(123, "Коробка картонная", Category.OTHER)

    shirt.printProductInfo()
    pen.printProductInfo()
    box.printProductInfo()

}

enum class Category{
    DRESS{
        override fun nameOfCategory(): String {
            return "Одежда"
        }
    },
    OFFICE_SUPPLIES{
        override fun nameOfCategory(): String {
            return "Канцелярские товары"
        }
    },
    OTHER{
        override fun nameOfCategory(): String {
            return "Разное"
        }
    };

    abstract fun nameOfCategory(): String
}

class Product(
    val id: Int,
    val name: String,
    val category: Category,
){
    fun printProductInfo(){
        println("Товар: $id $name в категории: ${category.nameOfCategory()}")
    }
}