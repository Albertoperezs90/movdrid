package com.tutorial.aperezsi.domain.mappers

import com.tutorial.aperezsi.domain.errors.GetConsortiumError
import com.tutorial.aperezsi.domain.errors.GetSubWaysError
import com.tutorial.aperezsi.domain.model.Consortium
import com.tutorial.aperezsi.domain.model.Subway
import com.tutorial.aperezsi.domain.result.Either

fun Either<GetSubWaysError, Subway>.mapToConsortium() : Either<GetConsortiumError, Consortium> {
    return when (this){
        is Either.Failure -> { Either.Failure(this.error.mapToConsortiumError())}
        is Either.Success -> { Either.Success(this.value.mapToConsortium())}
    }
}

fun GetSubWaysError.mapToConsortiumError() : GetConsortiumError {
    return when (this){
        is GetSubWaysError.RepositoryFailure -> {GetConsortiumError.RepositoryFailure(this.repositoryError)}
        is GetSubWaysError.EmptyData -> {GetConsortiumError.EmptyData}
    }
}


fun Subway.mapToConsortium() : Consortium {
    return Consortium().apply {
        subways = Either.Success(this@mapToConsortium)
    }
}