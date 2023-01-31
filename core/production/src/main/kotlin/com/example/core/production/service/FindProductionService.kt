package com.example.core.production.service

import com.example.core.production.domain.Production
import com.example.core.production.usecase.FindProductionsUseCase
import org.springframework.stereotype.Component

@Component
class FindProductionService : FindProductionsUseCase {
    override fun getProductions(ids: Collection<Long>): Map<Long, Production> {
        TODO("Not yet implemented")
    }
}
