package com.tutorial.aperezsi.data.repository

import com.tutorial.aperezsi.data.mappers.mapToDomain
import com.tutorial.aperezsi.data.remote.ConsortiumService
import com.tutorial.aperezsi.data.repository.base.BaseRepository
import com.tutorial.aperezsi.domain.errors.GetBusesError
import com.tutorial.aperezsi.domain.model.Bus
import com.tutorial.aperezsi.domain.repository.IBusRepository
import com.tutorial.aperezsi.domain.result.Either
import org.koin.standalone.inject

class BusRepository : BaseRepository(), IBusRepository {

    val remote: ConsortiumService by inject()

    override suspend fun getBusData(): Either<GetBusesError, List<Bus>> {
        return remote.getBuses().await().mapToDomain()
    }
}