// Task 15.2.3: demo program
fun main() {
    val savings = SavingsAccount("Alice", 0.0, 0.05)
    savings.deposit(250.0)

    savings.accrueInterest()
    savings.accrueInterest()
    savings.accrueInterest()

    println("Balance after 3 years: ${savings.getCurrentBalance()}")
}