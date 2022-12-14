package dk.microservicesApp.datasource
import dk.microservicesApp.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
}