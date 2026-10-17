// Task 12.4.1: main program
fun main() {
    val centre = Point(0.0, 0.0)

    val circle = Circle(centre, 5.0)
    println("Area: ${circle.area()}")
    println("Perimeter: ${circle.perimeter()}")

    val insidePoint = Point(3.0, 4.0)
    val outsidePoint = Point(6.0, 6.0)

    println("Is insidePoint inside? ${circle contains insidePoint}")
    println("Is outsidePoint inside? ${circle contains outsidePoint}")

    println("Trying to create a circle with negative radius...")
    val invalidCircle = Circle(centre, -1.0)
}