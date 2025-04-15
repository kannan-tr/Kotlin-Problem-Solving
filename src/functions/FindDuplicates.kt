package functions

fun main() {
    val name = "Kotlin Programming Language"
    println("Duplicate chars are: ${findDuplicateElementsWithCount(name.toList())}")
    val numbers = listOf(1, 2, 3, 4, 5, 2, 3, 4, 6, 7, 8, 9, 1, 3)
    println("Duplicate numbers are: ${findDuplicateElementsWithCount(numbers)}")
}

fun <T> findDuplicateElementsWithCount(items: List<T>): Map<T, Int> {
    val countMap = mutableMapOf<T, Int>()

    for (item in items) {
        countMap[item] = countMap.getOrDefault(item, 0) + 1
    }
    return countMap.filter { it.value > 1 }
}