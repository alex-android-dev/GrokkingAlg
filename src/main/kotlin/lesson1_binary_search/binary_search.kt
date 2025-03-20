package lesson1_binary_search

fun main() {

    val list = listOf(1, 3, 5, 7, 9)
    val item = 10

    val result = binarySearch(list, item)
    println(result)
}

private fun binarySearch(list: List<Int>, item: Int): Int? {

    var lowPosition = 0 // Нижняя граница
    var highPosition = list.size - 1 // Последний элемент

    while (lowPosition <= highPosition) {

        val midPosition = (lowPosition + highPosition) / 2 // Берем индекс середины списка

        val guess = list[midPosition] // Средний элемент

        if (guess == item) return midPosition // нашли элемент
        else if (guess > item) highPosition = midPosition - 1 // много
        else lowPosition = midPosition + 1
    }

    return null

}