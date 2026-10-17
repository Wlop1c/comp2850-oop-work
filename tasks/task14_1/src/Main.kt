// Task 14.1: program that uses Customer
import myapp.orders.Customer

fun main() {
    val customer = Customer("001", "Alice")
    println("Customer: ${customer.name}, ID: ${customer.id}")
}