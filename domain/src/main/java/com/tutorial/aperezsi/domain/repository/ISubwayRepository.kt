package com.tutorial.aperezsi.domain.repository

import com.tutorial.aperezsi.domain.errors.GetSubWaysError
import com.tutorial.aperezsi.domain.model.Subway
import com.tutorial.aperezsi.domain.result.Either

interface ISubwayRepository {
    suspend fun getSubWayData() : Either<GetSubWaysError, List<Subway>>
}