package com.tutorial.aperezsi.domain.errors

sealed class GetSubUrbansError {
    class RepositoryFailure(val repositoryError: RepositoryError) : GetSubUrbansError()
    object EmptyData : GetSubUrbansError()
}