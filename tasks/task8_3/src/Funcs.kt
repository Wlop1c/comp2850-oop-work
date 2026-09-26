// Task 8.3: functions for temperature analysis
import kotlin.io.path.Path
import kotlin.io.path.forEachLine

typealias Record = Pair<String, Double>

fun fetchData(filename: String): List<Record> = buildList {
    Path(filename).forEachLine { line ->
        val parts = line.split(",")
        if (parts.size == 2) {
            add(Pair(parts[0].trim(), parts[1].trim().toDoubleOrNull() ?: 0.0))
        }
    }
}