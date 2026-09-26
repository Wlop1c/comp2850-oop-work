fun main(args: Array<String>) {
    for (arg in args) {
        val mark = arg.toIntOrNull() ?: continue
        println("$mark is a ${grade(mark)}")
    }
}
