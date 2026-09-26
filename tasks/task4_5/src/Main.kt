// Task 4.5: summing odd integers with a for loop
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Error:  provide the upper limit as a command line argument.")
        exitProcess(1)
    }
    val limit = args[0].toIntOrNull()
    if (limit == null || limit <= 0) {
        println("Error:  limit must be a valid positive integer.")
        exitProcess(1)
    }

    var sum: Long = 0

    for (i in 1..limit step 2) {
        sum += i
    }
    println("Sum of odd integers from 1 to $limit is: $sum")
}