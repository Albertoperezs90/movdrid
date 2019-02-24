package com.tutorial.aperezsi.domain.errors

sealed class GetConsortiumError{
    class RepositoryFailure(val repositoryError: RepositoryError) : GetConsortiumError()
    object EmptyData : GetConsortiumError()
}