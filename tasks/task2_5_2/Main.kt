private const val MAX_USERS = 100
private const val PI = 3.14

fun main() {
    val currentUsers = 45
    val isOverLimit = currentUsers > MAX_USERS

    println("Max users allowed: $MAX_USERS")
    println("Current users: $currentUsers")
    println("Is over limit? $isOverLimit")

    val radius = 2.0
    val area = PI * radius * radius
    println("Area of circle with radius $radius is $area")
}