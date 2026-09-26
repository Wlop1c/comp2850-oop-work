fun main(args: Array<String>) {
    if (args.isEmpty()) return
    val radius = args[0].toDoubleOrNull() ?: return
    println("Area: %.4f".format(circleArea(radius)))
    println("Perimeter: %.4f".format(circlePerimeter(radius)))
}