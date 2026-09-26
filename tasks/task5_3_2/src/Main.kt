// Task 5.3.2: main program
fun main(args: Array<String>) {

    println("--- Defaults: d6 x1 ---")
    rollDice()


    println("--- Positional: d20 x2 ---")
    rollDice(20, 2)

    println("--- Named: d8 x3 ---")
    rollDice(numberOfDice = 3, sides = 8)

    if (args.isNotEmpty()) {
        val input = args[0]
        val parts = input.split("d")
        if (parts.size == 2) {
            val num = parts[0].toIntOrNull() ?: 1
            val sides = parts[1].toIntOrNull() ?: 6
            println("--- Command Line Roll: $input ---")
            rollDice(sides = sides, numberOfDice = num)
        }
    }
}