package com.tutorial.aperezsi.data.mappers

import com.tutorial.aperezsi.data.entities.BusEntity
import com.tutorial.aperezsi.data.entities.common.BaseEntityResponse
import com.tutorial.aperezsi.domain.errors.GetBusesError
import com.tutorial.aperezsi.domain.errors.RepositoryError
import com.tutorial.aperezsi.domain.model.Bus
import com.tutorial.aperezsi.domain.result.Either

fun BaseEntityResponse<BusEntity>.mapToDomain() : Either<GetBusesError, List<Bus>> {
    return this.features?.let { busesEntity ->
        if (busesEntity.isEmpty()){
            Either.Failure(GetBusesError.EmptyData)
        }else {
            Either.Success(busesEntity.map {
                    Bus(
                        stationId = it.attributes.IDESTACION,
                        stationName = it.attributes.DENOMINACION,
                        stationObs = it.attributes.OBSERVACIONES,
                        actualDate = it.attributes.FECHAACTUAL,
                        codeStation = it.attributes.CODIGOESTACION,
                        codeProvince = it.attributes.CODIGOPROVINCIA,
                        codeMunicipio = it.attributes.CODIGOMUNICIPIO,
                        codeEntity = it.attributes.CODIGOENTIDAD,
                        codeCore = it.attributes.CODIGONUCLEO,
                        codeVia = it.attributes.CODIGOVIA,
                        typeVia = it.attributes.TIPOVIA,
                        district = it.attributes.DISTRITO,
                        taxZone = it.attributes.CORONATARIFARIA,
                        startDate = it.attributes.FECHAALTA,
                        startEnd = it.attributes.FECHAFIN,
                        geometryX = it.geometry.x,
                        geometryY = it.geometry.y
                    )
                })
        }
    } ?: Either.Failure(GetBusesError.RepositoryFailure(RepositoryError.InvalidRequest))
}