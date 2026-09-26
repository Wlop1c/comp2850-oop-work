// Task 5.1.1: anagrams() function
infix fun String.anagramOf(other: String): Boolean {
    if (this.length != other.length) return false
    val thisChars = this.lowercase().toList().sorted()
    val otherChars = other.lowercase().toList().sorted()
    return thisChars == otherChars
}