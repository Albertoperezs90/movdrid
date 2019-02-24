package com.tutorial.aperezsi.domain.repository

import com.tutorial.aperezsi.domain.errors.GetSubUrbansError
import com.tutorial.aperezsi.domain.model.SubUrban
import com.tutorial.aperezsi.domain.result.Either

interface ISubUrbanRepository {
    suspend fun getSubUrbanData() : Either<GetSubUrbansError, List<SubUrban>>
}