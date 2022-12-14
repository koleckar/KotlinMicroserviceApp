package dk.kotlinmicroservicesapp.datasource.mock

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test


internal class MockBankDataSourceTest {

    private val mockDataSource = MockBankDataSource()

    @Test
    fun `should provide a collection of banks`() {
        // when
        val banks = mockDataSource.retrieveBanks()
        // then
        Assertions.assertThat(banks).isNotEmpty
    }

    @Test
    fun `should provide some mock data`() {
        // when
        val banks = mockDataSource.retrieveBanks()
        // then
        Assertions.assertThat(banks).allMatch { it.accountNumber.isNotBlank() }
        Assertions.assertThat(banks).anyMatch { it.transactionFee >= 0 }
        Assertions.assertThat(banks).anyMatch { it.trust >= 0 }
    }
}