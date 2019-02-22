package com.tutorial.aperezsi.data.repository

import com.tutorial.aperezsi.data.mappers.mapToDomain
import com.tutorial.aperezsi.data.remote.ConsortiumService
import com.tutorial.aperezsi.data.repository.base.BaseRepository
import com.tutorial.aperezsi.domain.entities.ConsortiumEntity
import com.tutorial.aperezsi.domain.entities.Result
import com.tutorial.aperezsi.domain.repository.IConsortiumRepository
import org.koin.standalone.inject

class ConsortiumRepository : BaseRepository(), IConsortiumRepository {

    val remote: ConsortiumService by inject()

    override suspend fun getConsortiumData(): Result<ConsortiumEntity> {
        return Result.Success(remote.getLightSubway().await().mapToDomain())
    }
}