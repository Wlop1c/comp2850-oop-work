// Task 9.6: application to compute dataset variance
import kotlin.system.exitProcess

fun main(args: Array<String>) {

    if (args.isEmpty()) {
        println("错误：请提供文件名作为命令行参数！")
        exitProcess(1)
    }

    val filename = args[0]

    try {

        val dataset = readData(filename)


        val result = variance(dataset)

        println("数据集大小：${dataset.size}")
        println("方差：%.5f".format(result))

    } catch (e: Exception) {

        println("发生错误：${e.message}")

        exitProcess(1)
    }
}