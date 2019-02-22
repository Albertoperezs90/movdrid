package com.tutorial.aperezsi.domain.entities

sealed class Result<T>(val complete: Boolean) {

    data class Success<T>(val value: T) : Result<T>(complete = true)
    data class Failure<T>(val error: String?) : Result<T>(complete = true)
    class Loading<T> : Result<T>(complete = false)

}
