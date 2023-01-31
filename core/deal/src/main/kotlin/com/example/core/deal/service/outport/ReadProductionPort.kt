package com.example.core.deal.service.outport

import com.example.core.deal.domain.Production

interface ReadProductionPort {
    fun getProductions(ids: Collection<Long>): Map<Long, Production>
}
