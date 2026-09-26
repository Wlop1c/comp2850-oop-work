// Task 7.7.2: phone book simulator
fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Error: provide the CSV filename as an argument.")
        return
    }
    val filename = args[0]
    val db = emptyDatabase()
    db.load(filename)

    println("Phonebook loaded. Type a name to look up or type 'quit' to exit.")
    while (true) {
        print("Name: ")
        val input = readlnOrNull()?.trim() ?: break
        if (input.equals("quit", ignoreCase = true)) break
        if (input.isEmpty()) continue

        if (db.containsKey(input)) {
            println("Number: ${db[input]}")
        } else {
            print("Not found. enter the phone number for $input: ")
            val number = readlnOrNull()?.trim() ?: break
            if (number.isNotEmpty()) {
                db[input] = number
                db.save(filename)
                println("Saved!")
            }
        }
    }
    println("Goodbye!")
}