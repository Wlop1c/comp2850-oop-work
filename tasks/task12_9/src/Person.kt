// Task 12.9: class implementing the Static Factory Method pattern
import kotlinx.datetime.LocalDate

class Person private constructor(val name: String, val birth: LocalDate) {


    companion object Factory {

        private val existingNames = mutableSetOf<String>()

        fun create(name: String, birth: LocalDate): Person {

            require(name !in existingNames) { "Person with name $name already exists" }

            existingNames.add(name)
            return Person(name, birth)
        }
    }
}