// Task 12.8.2: class to represent playing cards
data class Card(val suit: Suit, val rank: Rank) {

    val fullName: String
        get() {
            val suitName = suit.name.lowercase().replaceFirstChar { it.uppercase() }
            val rankName = rank.name.lowercase().replaceFirstChar { it.uppercase() }
            return "$rankName of $suitName"
        }

    override fun toString(): String {
        return "$rank$suit"
    }
}