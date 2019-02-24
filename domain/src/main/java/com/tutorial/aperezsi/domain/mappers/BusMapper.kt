package com.tutorial.aperezsi.domain.mappers

import com.tutorial.aperezsi.domain.errors.GetBusesError
import com.tutorial.aperezsi.domain.errors.GetConsortiumError
import com.tutorial.aperezsi.domain.model.Bus
import com.tutorial.aperezsi.domain.model.Consortium
import com.tutorial.aperezsi.domain.result.Either

fun Either<GetBusesError, Bus>.mapToConsortium() : Either<GetConsortiumError, Consortium>{
    return when (this){
        is Either.Failure -> { Either.Failure(this.error.mapToGetConsortiumError()) }
        is Either.Success -> { Either.Success(this.value.mapToConsortium())}
     }
}


fun Bus.mapToConsortium() : Consortium {
    return Consortium().apply {
        buses = Either.Success(this@mapToConsortium)
    }
}


fun GetBusesError.mapToGetConsortiumError() : GetConsortiumError {
    return when (this){
        is GetBusesError.RepositoryFailure -> { GetConsortiumError.RepositoryFailure(this.repositoryError) }
        is GetBusesError.EmptyData -> { GetConsortiumError.EmptyData }
    }
}


