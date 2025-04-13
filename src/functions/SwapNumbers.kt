package functions

fun main() {
    var a = 10
    var b = 20

    println("Before swapping: a -> $a, b -> $b")

    a += b
    b = a - b
    a -= b

    println("After swapping: a -> $a, b -> $b")

    swapTwoNumbers()
}

// Swap two numbers using Scope numbers
fun swapTwoNumbers() {
    println("Using scope functions:")

    var a = 50
    var b = 100

    println("Before swapping: a -> $a, b -> $b")

    a = b.also { b = a }

    println("After swapping: a -> $a, b -> $b")
}
