package com.example.core.deal.usecase

import com.example.core.deal.domain.Deal

interface ReadDealUseCase {
    fun getDeals(command: ReadDealCommand): List<Deal>

    interface ReadDealCommand {
        val name: String
    }
}
