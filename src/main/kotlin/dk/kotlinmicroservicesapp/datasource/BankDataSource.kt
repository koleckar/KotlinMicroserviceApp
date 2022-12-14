package dk.kotlinmicroservicesapp.datasource
import dk.kotlinmicroservicesapp.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
}