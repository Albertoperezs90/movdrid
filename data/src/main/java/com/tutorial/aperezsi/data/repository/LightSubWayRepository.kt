package com.tutorial.aperezsi.data.repository

import com.tutorial.aperezsi.data.mappers.mapToDomain
import com.tutorial.aperezsi.data.remote.ConsortiumService
import com.tutorial.aperezsi.data.repository.base.BaseRepository
import com.tutorial.aperezsi.domain.errors.GetLightSubWaysError
import com.tutorial.aperezsi.domain.model.LightSubWay
import com.tutorial.aperezsi.domain.repository.ILightSubWayRepository
import com.tutorial.aperezsi.domain.result.Either
import org.koin.standalone.inject

class LightSubWayRepository : BaseRepository(), ILightSubWayRepository {

    val remote: ConsortiumService by inject()

    override suspend fun getLightSubWayData(): Either<GetLightSubWaysError, List<LightSubWay>> {
        return remote.getLightSubways().await().mapToDomain()
    }
}