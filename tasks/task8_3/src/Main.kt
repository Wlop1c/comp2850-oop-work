// Task 8.3: weather station temperature analysis program
fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("provide the CSV filename as an argument.")
        return
    }

    val dataset = fetchData(args[0])

    if (dataset.isEmpty()) {
        println("No data found in the file.")
        return
    }

    val coldest = dataset.minBy { it.second }
    val warmest = dataset.maxBy { it.second }

    println("Coldest station: ${coldest.first} (${coldest.second} °C)")
    println("Warmest station: ${warmest.first} (${warmest.second} °C)")

    val averageTemp = dataset.map { it.second }.average()

    println("Average temperature: %.2f °C".format(averageTemp))
}