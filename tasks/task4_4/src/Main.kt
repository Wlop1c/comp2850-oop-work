// Task 4.4: temperature conversion using a while loop
import kotlin.system.exitProcess
fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error:  provide three arguments: startTemp, maxTemp, increment.")
        exitProcess(1)
    }

    val startTemp = args[0].toDoubleOrNull()
    val maxTemp = args[1].toDoubleOrNull()
    val increment = args[2].toDoubleOrNull()

    if (startTemp == null || maxTemp == null || increment == null) {
        println("Error: All arguments must be valid floating-point numbers.")
        exitProcess(1)
    }

    println(String.format("%10s %10s", "Celsius", "Fahrenheit"))
    println("-".repeat(22))

    var currentTemp = startTemp
    while (currentTemp <= maxTemp) {
        val fahrenheit = currentTemp * 9.0 / 5.0 + 32.0

        println(String.format("%10.1f %10.1f", currentTemp, fahrenheit))
        currentTemp += increment
    }
}