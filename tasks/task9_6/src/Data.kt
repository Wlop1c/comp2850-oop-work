// Task 9.6: readData() function
import kotlin.io.path.Path
import kotlin.io.path.forEachLine

fun readData(filename: String): List<Double> {
    val result = mutableListOf<Double>()

    Path(filename).forEachLine { line ->

        result.add(line.toDouble())
    }

    return result
}