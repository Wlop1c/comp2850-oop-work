// Task 15.3: program demonstrating dynamic binding
fun main() {
    val p1 = Person("Alice")
    val s1 = Student("Bob", "Computer Science")

    p1.speak()
    s1.speak()

    val p2: Person = Student("Charlie", "Maths")
    p2.speak()
}