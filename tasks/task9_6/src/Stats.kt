// Task 9.6: variance() function
fun variance(dataset: List<Double>): Double {

    require(dataset.size >= 2) { "数据集大小不能少于2" }

    val mean = dataset.average()

    val sumSquaredDev = dataset.map { it - mean }.sumOf { it * it }

    return sumSquaredDev / (dataset.size - 1)
}