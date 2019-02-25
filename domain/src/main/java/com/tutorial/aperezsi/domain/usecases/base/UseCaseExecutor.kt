package com.tutorial.aperezsi.domain.usecases.base

import com.tutorial.aperezsi.domain.result.Either

interface UseCaseExecutor<F,S> {
    suspend fun execute(delayed: Long = 0) : Either<F, S>
}