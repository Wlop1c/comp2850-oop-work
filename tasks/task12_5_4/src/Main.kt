// Task 12.5.4: demo program for class with a computed property
import kotlinx.datetime.LocalDate

fun main() {

    val p = Person("Alice", LocalDate(1997, 8, 23))


    println("Name: ${p.name}, Age: ${p.age}")
}