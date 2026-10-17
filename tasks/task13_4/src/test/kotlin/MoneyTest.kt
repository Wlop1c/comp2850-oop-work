// Task 13.4: unit tests for Money class
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe
import io.kotest.assertions.throwables.shouldThrow

class MoneyTest : FreeSpec({
    "Creation" - {
        "amount and currency are stored" {
            val money = Money(10, "USD")
            money.amount shouldBe 10
            money.currency shouldBe "USD"
        }
        "a different amount can be stored" {
            val money = Money(100, "GBP")
            money.amount shouldBe 100
            money.currency shouldBe "GBP"
        }
    }

    "Robustness" - {
        "negative amount throws exception" {
            shouldThrow<IllegalArgumentException> {
                Money(-1, "USD")
            }
        }
        "blank currency throws exception" {
            shouldThrow<IllegalArgumentException> {
                Money(10, "  ")
            }
        }
    }

    "Addition" - {
        "same currencies can be added" {
            val m1 = Money(10, "USD")
            val m2 = Money(20, "USD")
            (m1 + m2) shouldBe Money(30, "USD")
        }
        "different currencies cannot be added" {
            val m1 = Money(10, "USD")
            val m2 = Money(10, "GBP")
            shouldThrow<IllegalArgumentException> {
                m1 + m2
            }
        }
        "integer can be added to money" {
            val m1 = Money(10, "USD")
            (m1 + 10) shouldBe Money(20, "USD")
        }
        "zero amounts can be added" {
            val m1 = Money(0, "USD")
            val m2 = Money(0, "USD")
            (m1 + m2) shouldBe Money(0, "USD")
        }
    }
})