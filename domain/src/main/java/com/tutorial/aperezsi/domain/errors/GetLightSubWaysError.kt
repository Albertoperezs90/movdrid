package com.tutorial.aperezsi.domain.errors

sealed class GetLightSubWaysError {
    class RepositoryFailure(val repositoryError: RepositoryError) : GetLightSubWaysError()
    object EmptyData : GetLightSubWaysError()
}