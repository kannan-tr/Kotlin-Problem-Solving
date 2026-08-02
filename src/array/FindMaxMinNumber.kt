package array

fun main() {
    findMaxAndMin()
}

fun findMaxAndMin() {
    val numbers = intArrayOf(90, 3, 4, 50, 20, 99, 45, 76, 1)

    if (numbers.isEmpty()) {
        println("Array is Empty")
        return
    }

    var maxNum = numbers[0]
    var minNum = numbers[0]

    for (number in numbers) {
        if (number > maxNum) {
            maxNum = number
        }

        if (number < minNum) {
            minNum = number
        }
    }

    println("Minimum number is $minNum")
    println("Maximum number is $maxNum")
}