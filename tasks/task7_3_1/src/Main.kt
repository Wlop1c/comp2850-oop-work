// Task 7.3.1: list element access
fun main() {
    val numbers = listOf(9, 3, 6, 2, 8, 5)
    println(numbers)

    println("First element: ${numbers[0]}")

    println("Slice 2..4: ${numbers.slice(2..4)}")

    println("First: ${numbers.first()}")
    println("Last: ${numbers.last()}")

}