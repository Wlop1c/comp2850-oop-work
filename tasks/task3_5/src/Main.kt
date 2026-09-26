// Task 3.5: simple file I/O
import kotlin.io.path.*
fun main() {
    val filePath = Path("test.txt")

    filePath.writeText("第一次内容。\n")

    filePath.writeText("第二次写内容，覆盖\n")

    filePath.appendText("追加内容\n")

    val fileContents = filePath.readText()
    println("文件内容如下")
    println(fileContents)
}