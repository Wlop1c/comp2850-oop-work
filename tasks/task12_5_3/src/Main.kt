// Task 12.5.3: demo program for class with custom setter
import kotlinx.datetime.LocalDate

fun main() {
    val p = Person("Alice", LocalDate(1997, 8, 23))
    p.name = "Bob"
    println(p.name)

    println("Attempting to set an empty name...")
    p.name = "   "
}