// Task 5.4.1: main program
fun main() {
    val shortString = "Hello World"
    val longString = "This is a very long string that exceeds 20 characters."

    println("Is '$shortString' too long? ${shortString.isTooLong}")
    println("Is '$longString' too long? ${longString.isTooLong}")
}