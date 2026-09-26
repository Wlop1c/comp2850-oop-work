// Task 6.5: unit tests for grade()
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe
import io.kotest.assertions.withClue

class GradeTest : FreeSpec({
    "Marks 0 to 39 give a Fail" {
        withClue("Mark=0") { grade(0) shouldBe "Fail" }
        withClue("Mark=20") { grade(20) shouldBe "Fail" }
        withClue("Mark=39") { grade(39) shouldBe "Fail" }
    }
    "Marks 40 to 69 give a Pass" {
        withClue("Mark=40") { grade(40) shouldBe "Pass" }
        withClue("Mark=55") { grade(55) shouldBe "Pass" }
        withClue("Mark=69") { grade(69) shouldBe "Pass" }
    }
    "Marks 70 to 100 give a Distinction" {
        withClue("Mark=70") { grade(70) shouldBe "Distinction" }
        withClue("Mark=85") { grade(85) shouldBe "Distinction" }
        withClue("Mark=100") { grade(100) shouldBe "Distinction" }
    }
    "Marks below 0 give a ?" {
        withClue("Mark=-1") { grade(-1) shouldBe "?" }
        withClue("Mark=-5") { grade(-5) shouldBe "?" }
    }
    "Marks above 100 give a ?" {
        withClue("Mark=101") { grade(101) shouldBe "?" }
        withClue("Mark=105") { grade(105) shouldBe "?" }
    }
})