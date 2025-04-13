package array

fun main() {
    val numbers = arrayOf(1, 4, 2, 7, 9, 5, 8, 10, 15)
    println(findSecondLargestNumbers(numbers))
}

fun findSecondLargestNumbers(numbers: Array<Int>): Int {
    var largest = Int.MIN_VALUE
    var secondLargest = Int.MIN_VALUE

    for (num in numbers) {
        when {
            num > largest -> {
                secondLargest = largest
                largest = num
            }

            num > secondLargest && num != largest -> {
                secondLargest = num
            }
        }
    }
    return secondLargest
}
