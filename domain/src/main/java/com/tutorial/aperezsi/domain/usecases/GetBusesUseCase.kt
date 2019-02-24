package com.tutorial.aperezsi.domain.usecases

import com.tutorial.aperezsi.domain.errors.GetBusesError
import com.tutorial.aperezsi.domain.model.Bus
import com.tutorial.aperezsi.domain.repository.IBusRepository
import com.tutorial.aperezsi.domain.result.Either
import com.tutorial.aperezsi.domain.usecases.base.UseCaseExecutor
import kotlinx.coroutines.delay

class GetBusesUseCase (val repository: IBusRepository) : UseCaseExecutor<GetBusesError, List<Bus>> {

    override suspend fun execute(delayed: Long): Either<GetBusesError, List<Bus>> {
        delay(delayed)
        return repository.getBusData()
    }
}