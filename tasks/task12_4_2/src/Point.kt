// Task 12.4.2: Point class with overridden toString()
class Point(val x: Double, val y: Double) {
    override fun toString(): String {
        return "($x, $y)"
    }
}