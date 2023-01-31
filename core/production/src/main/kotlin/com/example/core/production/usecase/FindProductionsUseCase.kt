package com.example.core.production.usecase

import com.example.core.production.domain.Production

interface FindProductionsUseCase {
    fun getProductions(ids: Collection<Long>): Map<Long, Production>
}
