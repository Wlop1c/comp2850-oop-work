// Task 12.8.1: demo program for Day enum class
fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Please provide a day name or abbreviation (e.g., M, MONDAY).")
        println("Options are: ${Day.values().joinToString { it.name }}")
        return
    }

    for (arg in args) {
        val input = arg.uppercase()
        val matchedDays = Day.values().filter {
            it.name == input || it.name.startsWith(input)
        }

        if (matchedDays.isEmpty()) {
            println("Invalid input: $arg. Options are: ${Day.values().joinToString { it.name }}")
        } else {
            for (day in matchedDays) {
                println("${day.ordinal}: ${day.name}")
            }
        }
    }
}