// Task 4.2: use of if and ranges
fun main() {
    val x = 5
    println(x in 0..5)
    println(x in 0..<5)

    val number = 75
    if (number in 0..100) {
        println("$number in the range 0..100")
    } else {
        println("$number out of range")
    }
}