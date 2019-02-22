package com.tutorial.aperezsi.domain.usecases

import com.tutorial.aperezsi.domain.entities.ConsortiumEntity
import com.tutorial.aperezsi.domain.entities.Result

interface IConsortiumUseCase {
    suspend fun getData() : Result<ConsortiumEntity>
}