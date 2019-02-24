package com.tutorial.aperezsi.domain.usecases

import com.tutorial.aperezsi.domain.errors.GetLightSubWaysError
import com.tutorial.aperezsi.domain.model.LightSubWay
import com.tutorial.aperezsi.domain.repository.ILightSubWayRepository
import com.tutorial.aperezsi.domain.result.Either
import com.tutorial.aperezsi.domain.usecases.base.UseCaseExecutor
import kotlinx.coroutines.delay

class GetLightSubWaysUseCase(val repository: ILightSubWayRepository) : UseCaseExecutor<GetLightSubWaysError, List<LightSubWay>> {

    override suspend fun execute(delayed: Long): Either<GetLightSubWaysError, List<LightSubWay>> {
        delay(delayed)
        return repository.getLightSubWayData()
    }
}