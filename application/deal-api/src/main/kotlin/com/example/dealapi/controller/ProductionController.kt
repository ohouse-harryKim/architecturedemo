package com.example.dealapi.controller

import com.example.core.deal.usecase.ReadDealUseCase
import org.springframework.stereotype.Controller

@Controller
class ProductionController(
    private val productionUseCase: ReadDealUseCase
) {
}
