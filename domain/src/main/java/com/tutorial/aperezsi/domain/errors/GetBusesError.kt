package com.tutorial.aperezsi.domain.errors

sealed class GetBusesError {
    class RepositoryFailure(val repositoryError: RepositoryError) : GetBusesError()
    object EmptyData : GetBusesError()
}