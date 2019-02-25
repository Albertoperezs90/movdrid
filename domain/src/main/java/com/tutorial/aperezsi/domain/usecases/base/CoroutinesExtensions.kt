package com.tutorial.aperezsi.domain.usecases.base

import com.tutorial.aperezsi.domain.result.Either
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

fun <F, S> UseCaseExecutor<F,S>.launch(bg: () -> Either<F, S>){
    GlobalScope.async {
        bg()
    }
}