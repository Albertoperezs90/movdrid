package com.tutorial.aperezsi.domain.errors

sealed class GetSubWaysError {
    class RepositoryFailure(val repositoryError: RepositoryError) : GetSubWaysError()
    object EmptyData : GetSubWaysError()
}