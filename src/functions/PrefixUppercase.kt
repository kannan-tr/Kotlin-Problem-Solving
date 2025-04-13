package functions

fun main() {
    val name = "kotlin programming language"
    println(name.upperCasePrefix())
}

// Extension function to make first char to uppercase
fun String.upperCasePrefix(): String {
    return this.split(" ").joinToString(" ") {
        it.replaceFirstChar { x -> x.uppercase() }
    }
}