// Task 12.9: demo program for class implementing Static Factory Method
import kotlinx.datetime.LocalDate

fun main() {

    val p1 = Person.create("Alice", LocalDate(1997, 8, 23))
    println("Successfully created: ${p1.name}")


    println("Attempting to create another Alice...")
    val p2 = Person.create("Alice", LocalDate(2000, 1, 1))
    println("This line will not be printed.")
}