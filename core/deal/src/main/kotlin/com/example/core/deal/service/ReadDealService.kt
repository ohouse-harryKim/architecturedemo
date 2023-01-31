package com.example.core.deal.service

import com.example.core.deal.domain.Deal
import com.example.core.deal.service.outport.ReadDealPort
import com.example.core.deal.service.outport.ReadDealPort.FindDealCriteria
import com.example.core.deal.usecase.ReadDealUseCase
import com.example.core.deal.usecase.ReadDealUseCase.ReadDealCommand
import org.springframework.stereotype.Component

@Component
internal class ReadDealService(
    private val readDealPort: ReadDealPort
) : ReadDealUseCase {
    override fun getDeals(command: ReadDealCommand): List<Deal> {
        return readDealPort.findDeal(command.toCriteria())
    }

    fun ReadDealCommand.toCriteria(): FindDealCriteria = FindDealCriteria(
        name = this.name
    )
}
