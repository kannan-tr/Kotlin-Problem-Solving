package functions

fun main() {
    println(addTwoNumbers(30, 10, ::sum)) // function reference
    println(addTwoNumbers(30, 70) { a, b -> a + b }) // lambda expression
}

// Higher order function to add two numbers
fun addTwoNumbers(a: Int, b: Int, sum: (Int, Int) -> Int): Int {
    return sum(a, b)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}