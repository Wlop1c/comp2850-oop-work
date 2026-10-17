// Task 12.3.2: demo of Person class with secondary constructor
fun main() {
    val validPerson = Person("Alice", "1997-08-23")
    println("Valid person created: ${validPerson.name}")

    println("Attempting to create a person with a blank name...")
    val invalidPerson = Person("   ", "1997-08-23")
    println("This line will not be printed.")
}