package org.example.Lesson_11


fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))

}

class CategoryOfDish(
    val categoryId: Int,
    val imageUrl: String,
    val dishTitle: String,
    val dishDescription: String,
    val listOfeReceptsInCategory: List<Recept>,
)

class Recept(
    val idOfRecept: Int,
    var inFavorite: Boolean = false,
    val titleOfDish: String,
    val imageForDish: String,
    val ingredients: List<Ingredient>,
    var portions: Int,
    val descriptionOfRecept: String,
) {
    fun calculateIngredients(targetPortions: Int) {
        val ratio = targetPortions.toFloat() / portions
        for (item in ingredients) {
            item.quantityOfIngredient *= ratio
        }
        portions = targetPortions
    }

}

class Ingredient(
    val titleOfIngredient: String,
    var quantityOfIngredient: Float,
    var unitOfMeasure: String,
) {

}