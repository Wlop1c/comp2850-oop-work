// Task 7.3.1: list element access
fun main() {
    val numbers = mutableListOf(9, 3, 6, 2, 8, 5)
    println("Initial list: $numbers")

    numbers.add(1)
    println("After add(1): $numbers")

    numbers.remove(3)
    println("After remove(3): $numbers")

    numbers.removeAt(0)
    println("After removeAt(0): $numbers")

    numbers[0] = 10
    println("After numbers[0] = 10: $numbers")

    numbers.clear()
    println("After clear(): $numbers")
}