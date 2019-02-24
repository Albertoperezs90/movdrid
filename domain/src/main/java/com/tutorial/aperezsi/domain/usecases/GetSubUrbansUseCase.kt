package com.tutorial.aperezsi.domain.usecases

import com.tutorial.aperezsi.domain.errors.GetSubUrbansError
import com.tutorial.aperezsi.domain.model.SubUrban
import com.tutorial.aperezsi.domain.repository.ISubUrbanRepository
import com.tutorial.aperezsi.domain.result.Either
import com.tutorial.aperezsi.domain.usecases.base.UseCaseExecutor
import kotlinx.coroutines.delay

class GetSubUrbansUseCase(val repository: ISubUrbanRepository) : UseCaseExecutor<GetSubUrbansError, List<SubUrban>> {

    override suspend fun execute(delayed: Long): Either<GetSubUrbansError, List<SubUrban>> {
        delay(delayed)
        return repository.getSubUrbanData()
    }
}