fun main(args: Array<String>) {
    if (args.isEmpty())
        rollDie()
    } else {
        val sides = args[0].toIntOrNull()
        if (sides != null) {
            rollDie(sides)
        } else {
            println("Invalid input, rolling default d6 instead.")
            rollDie()
        }
    }
}