// Task 5.1.2: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Error:  provide the number of sides for the die (e.g., 6).")
        exitProcess(1)
    }

    val sides = args[0].toIntOrNull()
    if (sides == null) {
        println("Error: provide a valid integer for the number of sides.")
        exitProcess(1)
    }

    rollDie(sides)
}