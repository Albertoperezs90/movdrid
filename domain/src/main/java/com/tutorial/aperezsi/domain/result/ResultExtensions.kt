package com.tutorial.aperezsi.domain.result

fun <F, S, A> Either<F, S>.fold(e: (F) -> A, s: (S) -> A) : A = when (this){
    is Either.Failure -> e(this.error)
    is Either.Success -> s(this.value)
}