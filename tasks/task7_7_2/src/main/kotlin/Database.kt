// Task 7.7.2: database-handling functions
import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.writer

typealias Database = MutableMap<String, String>

fun emptyDatabase(): Database = mutableMapOf()

fun Database.load(filename: String) {
    Path(filename).forEachLine { line ->
        val parts = line.split(",")
        if (parts.size == 2) {
            this[parts[0]] = parts[1]
        }
    }
}

fun Database.save(filename: String) {
    Path(filename).writer().use { out ->
        this.forEach { (name, number) ->
            out.write("$name,$number\n")
        }
    }
}