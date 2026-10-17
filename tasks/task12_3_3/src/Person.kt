// Task 12.3.2: Person class with secondary constructor
import kotlinx.datetime.LocalDate

class Person(var name: String, val birth: LocalDate) {
    var isMarried = false

    constructor(name: String, birthDateString: String) : this(name, LocalDate.parse(birthDateString))


    init {
        require(name.isNotBlank()) { "Name cannot be blank" }
    }
}