// Task 15.2.3: BankAccount class
open class BankAccount(val accountHolder: String, protected var balance: Double) {

    fun deposit(amount: Double) {
        require(amount > 0) { "Deposit amount must be positive" }
        balance += amount
    }

    fun withdraw(amount: Double) {
        require(amount > 0) { "Withdrawal amount must be positive" }
        require(amount <= balance) { "Insufficient funds" }
        balance -= amount
    }

    fun getCurrentBalance(): Double {
        return balance
    }
}
