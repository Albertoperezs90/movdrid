package com.tutorial.aperezsi.domain.repository

import com.tutorial.aperezsi.domain.errors.GetLightSubWaysError
import com.tutorial.aperezsi.domain.model.LightSubWay
import com.tutorial.aperezsi.domain.result.Either

interface ILightSubWayRepository {
    suspend fun getLightSubWayData() : Either<GetLightSubWaysError, List<LightSubWay>>
}