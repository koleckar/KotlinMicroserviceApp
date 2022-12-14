package dk.microservicesApp.service

import dk.microservicesApp.datasource.BankDataSource
import dk.microservicesApp.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()

}