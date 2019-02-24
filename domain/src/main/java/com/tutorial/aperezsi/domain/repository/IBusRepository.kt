package com.tutorial.aperezsi.domain.repository

import com.tutorial.aperezsi.domain.errors.GetBusesError
import com.tutorial.aperezsi.domain.model.Bus
import com.tutorial.aperezsi.domain.result.Either

interface IBusRepository {
    suspend fun getBusData() : Either<GetBusesError, List<Bus>>
}