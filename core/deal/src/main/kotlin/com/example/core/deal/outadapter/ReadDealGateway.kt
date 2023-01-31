package com.example.core.deal.outadapter

import com.example.core.deal.service.outport.ReadDealPort
import com.example.core.deal.infrastructure.repository.DealRepository
import com.example.core.deal.domain.Deal
import org.springframework.stereotype.Component

@Component
internal class ReadDealGateway(
    private val dealRepository: DealRepository
) : ReadDealPort {
    override fun findDeal(criteria: ReadDealPort.FindDealCriteria): List<Deal> {
        TODO("Not yet implemented")
    }
}
