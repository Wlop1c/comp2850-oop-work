// Task 16.2: abstract Vehicle class
abstract class Vehicle(var fuel: Int) {
    fun refuel(amount: Int) {
        require(amount >= 0) { "Invalid fuel amount" }
        fuel += amount
    }

    abstract fun drive()
}