package com.tutorial.aperezsi.domain.usecases

import com.tutorial.aperezsi.domain.entities.ConsortiumEntity
import com.tutorial.aperezsi.domain.entities.Result
import com.tutorial.aperezsi.domain.repository.IConsortiumRepository

class ConsortiumUseCase(val repository: IConsortiumRepository) : IConsortiumUseCase {

    override suspend fun getData(): Result<ConsortiumEntity> {
        return repository.getConsortiumData()
    }
}