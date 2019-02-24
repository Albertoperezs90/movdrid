package com.tutorial.aperezsi.data.mappers

import com.tutorial.aperezsi.data.entities.SubUrbanEntity
import com.tutorial.aperezsi.data.entities.common.BaseEntityResponse
import com.tutorial.aperezsi.domain.errors.GetSubUrbansError
import com.tutorial.aperezsi.domain.errors.RepositoryError
import com.tutorial.aperezsi.domain.model.SubUrban
import com.tutorial.aperezsi.domain.result.Either

fun BaseEntityResponse<SubUrbanEntity>.mapToDomain() : Either<GetSubUrbansError, List<SubUrban>> {
    return this.features?.let { subUrbanEntities ->
        if (subUrbanEntities.isEmpty()){
            Either.Failure(GetSubUrbansError.EmptyData)
        }else {
            Either.Success(subUrbanEntities.map {
                    SubUrban(
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
    } ?: Either.Failure(GetSubUrbansError.RepositoryFailure(RepositoryError.InvalidRequest))
}