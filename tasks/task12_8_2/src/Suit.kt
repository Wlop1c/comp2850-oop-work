// Task 12.8.2: enum class for playing card suits
enum class Suit(val symbol: Char) {
    CLUBS('\u2663'),    // ♣
    DIAMONDS('\u2666'), // ♦
    HEARTS('\u2665'),   // ♥
    SPADES('\u2660');   // ♠

    override fun toString(): String {
        return symbol.toString()
    }
}