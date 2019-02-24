package com.tutorial.aperezsi.data.mappers

import com.tutorial.aperezsi.data.entities.SubwayEntity
import com.tutorial.aperezsi.data.entities.common.BaseEntityResponse
import com.tutorial.aperezsi.domain.errors.GetSubWaysError
import com.tutorial.aperezsi.domain.errors.RepositoryError
import com.tutorial.aperezsi.domain.model.Subway
import com.tutorial.aperezsi.domain.result.Either

fun BaseEntityResponse<SubwayEntity>.mapToDomain() : Either<GetSubWaysError, List<Subway>> {
    return this.features?.let { subWayEntities ->
        if (subWayEntities.isEmpty()){
            Either.Failure(GetSubWaysError.EmptyData)
        }else {
            Either.Success(subWayEntities.map {
                    Subway(
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
    } ?: Either.Failure(GetSubWaysError.RepositoryFailure(RepositoryError.InvalidRequest))
}