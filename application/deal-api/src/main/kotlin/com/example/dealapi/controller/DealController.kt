package com.example.dealapi.controller

import com.example.core.deal.usecase.ReadDealUseCase
import com.example.dealapi.model.DealDto
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class DealController(
    private val readDealUseCase: ReadDealUseCase
) {
    @GetMapping("deal")
    fun findProductions(command: ReadDealCommand): List<DealDto> {
        return readDealUseCase.getDeals(command)
            .map(::DealDto)
    }

    data class ReadDealCommand(
        override val name: String
    ): ReadDealUseCase.ReadDealCommand
}
