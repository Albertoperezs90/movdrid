package com.tutorial.aperezsi.data.repository

import com.tutorial.aperezsi.data.mappers.mapToDomain
import com.tutorial.aperezsi.data.remote.ConsortiumService
import com.tutorial.aperezsi.data.repository.base.BaseRepository
import com.tutorial.aperezsi.domain.errors.GetSubUrbansError
import com.tutorial.aperezsi.domain.model.SubUrban
import com.tutorial.aperezsi.domain.repository.ISubUrbanRepository
import com.tutorial.aperezsi.domain.result.Either
import org.koin.standalone.inject

class SubUrbanRepository : BaseRepository(), ISubUrbanRepository {

    val remote: ConsortiumService by inject()

    override suspend fun getSubUrbanData(): Either<GetSubUrbansError, List<SubUrban>> {
        return remote.getSubUrbans().await().mapToDomain()
    }
}