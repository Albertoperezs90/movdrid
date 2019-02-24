package com.tutorial.aperezsi.domain.usecases

import com.tutorial.aperezsi.domain.errors.GetSubWaysError
import com.tutorial.aperezsi.domain.model.Subway
import com.tutorial.aperezsi.domain.repository.ISubwayRepository
import com.tutorial.aperezsi.domain.result.Either
import com.tutorial.aperezsi.domain.usecases.base.UseCaseExecutor
import kotlinx.coroutines.delay

class GetSubWaysUseCase(val repository: ISubwayRepository) : UseCaseExecutor<GetSubWaysError, List<Subway>> {

    override suspend fun execute(delayed: Long): Either<GetSubWaysError, List<Subway>> {
        delay(delayed)
        return repository.getSubWayData()
    }

}