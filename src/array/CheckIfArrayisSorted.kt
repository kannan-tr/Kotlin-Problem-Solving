package array

fun main() {
    checkIfArrayIsSorted()
}

fun checkIfArrayIsSorted() {
    val arrayOne = intArrayOf(2, 2, 4, 5, 5, 6, 3, 8, 8, 10)

    if (arrayOne.isEmpty()) {
        println("arrayOne is Empty")
        return
    }

    for (i in 0 until arrayOne.size - 1) {
        if (arrayOne[i] > arrayOne[i + 1]) {
            println("Given array is not sorted")
            return
        }
    }

    println("Given array is Sorted")
}