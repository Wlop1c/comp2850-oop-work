// Task 13.4: Money class
data class Money(val amount: Int, val currency: String) {
    init {
        require(amount >= 0) { "Amount cannot be negative" }
        require(currency.isNotBlank()) { "Currency cannot be blank" }
    }

    operator fun plus(other: Money): Money {
        require(this.currency == other.currency) { "Cannot add different currencies" }
        return Money(this.amount + other.amount, this.currency)
    }

    operator fun plus(other: Int): Money {
        return Money(this.amount + other, this.currency)
    }
}