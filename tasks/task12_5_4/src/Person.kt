// Task 12.5.4: class with a computed property
import kotlinx.datetime.LocalDate
import kotlinx.datetime.yearsUntil

class Person(_name: String, val birth: LocalDate) {
    var isMarried = false
    var name = _name

    val age get() = birth.yearsUntil(today())
}