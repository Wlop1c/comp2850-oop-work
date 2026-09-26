// Task 4.3: grade calculation using a when expression
import kotlin.math.roundToInt
import kotlin.system.exitProcess

fun main(args: Array<String>) {

    if (args.size != 3) {
        println("Error:  provide  three integer marks.")
        exitProcess(1)
    }
    val mark1 = args[0].toIntOrNull()
    val mark2 = args[1].toIntOrNull()
    val mark3 = args[2].toIntOrNull()

    if (mark1 == null || mark2 == null || mark3 == null) {
        println("Error: marks must valid integers.")
        exitProcess(1)
    }
    val average = (mark1 + mark2 + mark3) / 3.0
    val roundedAverage = average.roundToInt()

    val grade = when (roundedAverage) {
        in 70..100 -> "Distinction"
        in 40..69  -> "Pass"
        in 0..39   -> "Fail"
        else       -> "?"
    }

    println("Rounded Average: $roundedAverage")
    println("Grade: $grade")
}