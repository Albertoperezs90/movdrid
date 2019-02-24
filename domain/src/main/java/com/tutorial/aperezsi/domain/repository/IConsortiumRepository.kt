package com.tutorial.aperezsi.domain.repository

import com.tutorial.aperezsi.domain.errors.GetBusesError
import com.tutorial.aperezsi.domain.errors.GetSubUrbansError
import com.tutorial.aperezsi.domain.errors.GetSubWaysError
import com.tutorial.aperezsi.domain.model.Bus
import com.tutorial.aperezsi.domain.model.SubUrban
import com.tutorial.aperezsi.domain.model.Subway
import com.tutorial.aperezsi.domain.result.Either

interface IConsortiumRepository {
    suspend fun getBusData() : Either<GetBusesError, Bus>
    suspend fun getSubWayData() : Either<GetSubWaysError, Subway>
    suspend fun getSubUrbanData() : Either<GetSubUrbansError, SubUrban>
}