package com.tutorial.aperezsi.domain.errors

sealed class RepositoryError {
    object NoInternet: RepositoryError()
    object NoPermission: RepositoryError()
    object InvalidRequest: RepositoryError()
}