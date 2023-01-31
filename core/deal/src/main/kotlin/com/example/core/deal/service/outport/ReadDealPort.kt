package com.example.core.deal.service.outport

import com.example.core.deal.domain.Deal

internal interface ReadDealPort {
    fun findDeal(criteria: FindDealCriteria): List<Deal>

    data class FindDealCriteria(
        val name: String
    )
}
