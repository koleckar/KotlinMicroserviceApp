package dk.kotlinmicroservicesapp.service

import dk.kotlinmicroservicesapp.datasource.BankDataSource
import dk.kotlinmicroservicesapp.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()

}