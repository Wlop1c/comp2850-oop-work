// Task 5.3.2: rollDice() function
import kotlin.random.Random

fun rollDice(sides: Int = 6, numberOfDice: Int = 1) {
    var total = 0
    repeat(numberOfDice) {
        total += Random.nextInt(1, sides + 1)
    }
    println("Rolling $numberOfDice d$sides... Total score: $total")
}