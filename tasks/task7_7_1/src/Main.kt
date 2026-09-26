// Task 7.7.1: program to compute stats for a numeric dataset
fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Error: Please provide the data filename as an argument.")
        return
    }
    val data = readData(args[0])
    displayStats(data)
}