import io.kotest.core.spec.IsolationMode
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe
import io.kotest.assertions.withClue

class TimeTest : FreeSpec({

    isolationMode = IsolationMode.InstancePerTest

    val midnight = Time(hours = 0, minutes = 0, seconds = 0)
    val noon = Time(hours = 12, minutes = 0, seconds = 0)
    val thirtyMin = Time(hours = 0, minutes = 30, seconds = 0)
    val thirtySec = Time(hours = 0, minutes = 0, seconds = 30)

    "Hours stored correctly" {
        withClue("00:00:00") { midnight.hours shouldBe 0 }
        withClue("12:00:00") { noon.hours shouldBe 12 }
    }

    "Minutes stored correctly" {
        withClue("00:00:00") { midnight.minutes shouldBe 0 }
        withClue("00:30:00") { thirtyMin.minutes shouldBe 30 }
    }

    "Seconds stored correctly" {
        withClue("00:00:00") { midnight.seconds shouldBe 0 }
        withClue("00:00:30") { thirtySec.seconds shouldBe 30 }
    }

    "Exception if hours are invalid" {
        io.kotest.assertions.throwAny {
            Time(hours = 24, minutes = 0, seconds = 0)
        }
    }
})