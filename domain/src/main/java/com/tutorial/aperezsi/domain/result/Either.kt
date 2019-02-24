package com.tutorial.aperezsi.domain.result

sealed class Either<out F, out S> {
    data class Failure<out F>(val error: F) : Either<F, Nothing>()
    data class Success<out S>(val value: S) : Either<Nothing, S>()
}

