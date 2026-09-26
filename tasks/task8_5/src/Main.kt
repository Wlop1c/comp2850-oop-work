// Task 8.5: example of using a higher-order function

fun main() {
    val text = "Hello World 123!"

    val vowelsCount = text.howMany { it.lowercase() in "aeiou" }
    println("Vowels count: $vowelsCount")

    val digitCount = text.howMany { it.isDigit() }
    println("Digits count: $digitCount")

    val uppercaseCount = text.howMany { it.isUpperCase() }
    println("Uppercase letters count: $uppercaseCount")
}