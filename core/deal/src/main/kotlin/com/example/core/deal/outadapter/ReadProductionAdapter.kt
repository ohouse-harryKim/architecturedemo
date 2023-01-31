package com.example.core.deal.outadapter

import com.example.core.deal.service.outport.ReadProductionPort
import com.example.core.deal.domain.Production
import com.example.core.production.usecase.FindProductionsUseCase
import org.springframework.stereotype.Component

@Component
internal class ReadProductionAdapter(
    private val findProductionsUseCase: FindProductionsUseCase
) : ReadProductionPort {
    override fun getProductions(ids: Collection<Long>): Map<Long, Production> {
        return findProductionsUseCase.getProductions(ids)
            .mapValues { it.value.toDomain() }
    }

    // extension fun 이 아닌 mapper 를 만들어 사용해도 OK
    // 어쩔수 없이 Production 이라는 동일한 이름의 class 가 두개나 만들어졌는데,
    // 이 관계를 끊을 방법은 없을까?
    fun com.example.core.production.domain.Production.toDomain(): Production {
        TODO()
    }
}
