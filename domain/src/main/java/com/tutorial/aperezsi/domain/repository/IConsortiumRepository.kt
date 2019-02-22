package com.tutorial.aperezsi.domain.repository

import com.tutorial.aperezsi.domain.entities.ConsortiumEntity
import com.tutorial.aperezsi.domain.entities.Result

interface IConsortiumRepository {
    suspend fun getConsortiumData() : Result<ConsortiumEntity>
}