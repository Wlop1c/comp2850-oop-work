// Task 5.1.1: main program
fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Error:provide two words to compare.")
        return
    }

    val word1 = args[0]
    val word2 = args[1]

    val result = anagrams(word1, word2)
    println("Are '$word1' and '$word2' anagrams? $result")
}