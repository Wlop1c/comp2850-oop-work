// Task 15.3: Student class, demonstrating method overriding
class Student(name: String, val degree: String) : Person(name) {
    override fun speak() = println("I am a Student, studying $degree")
}