// Task 12.8.2: program to manipulate playing cards
fun main() {
    val deck = mutableListOf<Card>()

    for (suit in Suit.values()) {
        for (rank in Rank.values()) {
            deck.add(Card(suit, rank))
        }
    }
    println("Total cards generated: ${deck.size}")

    deck.shuffle()

    println("\nTop 10 cards after shuffling:")
    for (i in 0 until 10) {
        val card = deck[i]
        println("Short: ${card} \t Full: ${card.fullName}")
    }
}