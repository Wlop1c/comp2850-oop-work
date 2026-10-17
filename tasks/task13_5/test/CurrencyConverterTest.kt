// Task 13.5: unit tests for CurrencyConverter
// (using a stub for ExchangeRateService)
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk

class CurrencyConverterTest : FreeSpec({

    "Currency converter mock tests" - {
        "mocks GBP to JPY exchange rate" {
            val mockService = mockk<ExchangeRateService>()
            every { mockService.getExchangeRate(any(), any()) } returns 1.2

            val converter = CurrencyConverter(mockService)
            val result = converter.convert(10.0, "GBP", "JPY")
            result shouldBe 12.0
        }

        "mocks a different rate" {
            val mockService = mockk<ExchangeRateService>()
            every { mockService.getExchangeRate(any(), any()) } returns 2.0

            val converter = CurrencyConverter(mockService)
            val result = converter.convert(10.0, "GBP", "USD")
            result shouldBe 20.0
        }
    }
})