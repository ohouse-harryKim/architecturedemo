package com.example.dealapi.model

import com.example.core.deal.domain.Deal

data class DealDto(
    val id: Long
) {
    constructor(deal: Deal) : this(
        id = deal.id
    )
}
