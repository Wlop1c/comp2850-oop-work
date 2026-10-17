// Task 15.2.3: SavingsAccount class
class SavingsAccount(
    accountHolder: String,
    initialBalance: Double,
    val interestRate: Double
) : BankAccount(accountHolder, initialBalance) {

    init {
        require(interestRate > 0) { "Interest rate must be greater than zero" }
    }

    fun accrueInterest() {
        balance += balance * interestRate
    }
}