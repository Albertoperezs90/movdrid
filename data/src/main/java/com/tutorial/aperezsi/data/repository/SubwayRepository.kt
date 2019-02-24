package com.tutorial.aperezsi.data.repository

import com.tutorial.aperezsi.data.mappers.mapToDomain
import com.tutorial.aperezsi.data.remote.ConsortiumService
import com.tutorial.aperezsi.data.repository.base.BaseRepository
import com.tutorial.aperezsi.domain.errors.GetSubWaysError
import com.tutorial.aperezsi.domain.model.Subway
import com.tutorial.aperezsi.domain.repository.ISubwayRepository
import com.tutorial.aperezsi.domain.result.Either
import org.koin.standalone.inject

class SubwayRepository : BaseRepository(), ISubwayRepository {

    val remote: ConsortiumService by inject()

    override suspend fun getSubWayData(): Either<GetSubWaysError, List<Subway>> {
        return remote.getSubWays().await().mapToDomain()
    }
}