package com.example.core.deal.infrastructure.repository

import com.example.core.deal.infrastructure.entity.DealEntity
import org.springframework.data.repository.CrudRepository

internal interface DealRepository : CrudRepository<DealEntity, Long>
