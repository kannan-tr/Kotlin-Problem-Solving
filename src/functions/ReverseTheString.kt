package functions

fun main() {
    val name = "Kotlin Programming Language"
    println(name.reverseTheString())

    println(name.reverseTheStringManual())
}

// Reverse the string using reversed function
fun String.reverseTheString(): String {
    return this.reversed()
}

// Reverse the string using manual function
fun String.reverseTheStringManual(): String {
    var reversed = ""

    if (this.isNotEmpty()) {
        for (chr in this.length - 1 downTo 0) {
            reversed += this[chr]
        }
    }

    return reversed
}