package dk.microservicesApp.service

import dk.microservicesApp.datasource.BankDataSource

import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

internal class BankServiceTest {

    private val dataSource = mockk<BankDataSource>(relaxed = true)
    private val bankService = BankService(dataSource)

    @Test
    fun `should call its datasource to retrieve banks`() {
        //given
        //every { dataSource.retrieveBanks() } returns emptyList() // not needed when mocck(relaxed)

        // when

        bankService.getBanks()
        // then
        verify(exactly = 1) { dataSource.retrieveBanks() }
    }
}