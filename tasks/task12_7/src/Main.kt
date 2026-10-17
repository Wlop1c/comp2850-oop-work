// Task 12.7: data classes vs regular classes
import kotlinx.datetime.LocalDate

fun main() {

    val p1 = Person("Dave", LocalDate(1997, 8, 23))
    val p2 = Person("Dave", LocalDate(1997, 8, 23))

    println("p1 == p2 : ${p1 == p2}")

    println("p1.hashCode() : ${p1.hashCode()}")
    println("p2.hashCode() : ${p2.hashCode()}")

    println("p1.toString() : $p1")

    p1.isMarried = true
    println("After p1 marries, p1 == p2 : ${p1 == p2}")
}
