package org.example.Lesson_22

fun main() {
    val viewModel = MainScreenViewModel()
    viewModel.loadData()
}

class MainScreenViewModel{
    var mainScreenState = MainScreenState("")
    fun loadData() {
        println(mainScreenState)
        mainScreenState = mainScreenState.copy(isLoading = true)
        println(mainScreenState)
        mainScreenState = mainScreenState.copy(data = "Получили какие-то данные", isLoading = false)
        println(mainScreenState)
    }
}

data class MainScreenState(
    val data: String,
    val isLoading: Boolean = false,
)