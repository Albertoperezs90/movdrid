package com.tutorial.aperezsi.domain.mappers

import com.tutorial.aperezsi.domain.errors.GetConsortiumError
import com.tutorial.aperezsi.domain.errors.GetSubUrbansError
import com.tutorial.aperezsi.domain.model.Consortium
import com.tutorial.aperezsi.domain.model.SubUrban
import com.tutorial.aperezsi.domain.result.Either

fun Either<GetSubUrbansError, SubUrban>.mapToConsortium() : Either<GetConsortiumError, Consortium> {
    return when (this){
        is Either.Failure -> { Either.Failure(this.error.mapToConsortiumError())}
        is Either.Success -> { Either.Success(this.value.mapToConsortium())}
    }
}


fun GetSubUrbansError.mapToConsortiumError() : GetConsortiumError {
    return when (this){
        is GetSubUrbansError.RepositoryFailure -> { GetConsortiumError.RepositoryFailure(this.repositoryError)}
        is GetSubUrbansError.EmptyData -> { GetConsortiumError.EmptyData }
    }
}


fun SubUrban.mapToConsortium() : Consortium {
    return Consortium().apply {
        subUrbans = Either.Success(this@mapToConsortium)
    }
}