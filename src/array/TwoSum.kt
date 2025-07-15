package array

fun main() {
    val numbers = intArrayOf(2, 7, 11, 15)
    val target = 9
    val result = twoSumNumbers(numbers, target)
    println("Result is : ${result.joinToString()}")
}

fun twoSumNumbers(numbers: IntArray, target: Int): IntArray {
    val numbersMap = HashMap<Int, Int>()
    var diff = 0

    for (i in numbers.indices) {
        diff = target - numbers[i]
        if (numbersMap.containsKey(diff)) {
            return intArrayOf(numbersMap[diff]!!, i)
        }
        numbersMap[numbers[i]] = i
    }

    return intArrayOf()
}