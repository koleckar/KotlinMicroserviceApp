package dk.kotlinmicroservicesapp.datasource.mock

import dk.kotlinmicroservicesapp.datasource.BankDataSource
import dk.kotlinmicroservicesapp.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {

    val banks = listOf(
        Bank("123", 0.0, 1),
        Bank("1614", 5.0, 11),
        Bank("139", 10.0, -1),
    )
    //val banks = emptyList<Bank>()

    override fun retrieveBanks(): Collection<Bank> = banks
}