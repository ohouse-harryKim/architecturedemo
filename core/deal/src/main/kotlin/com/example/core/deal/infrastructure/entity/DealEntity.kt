package com.example.core.deal.infrastructure.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
internal class DealEntity(
    @Id
    var id: Long?
)
