package com.tutorial.aperezsi.data.mappers

import com.tutorial.aperezsi.data.entities.LightSubwayEntity
import com.tutorial.aperezsi.data.entities.common.BaseEntityResponse
import com.tutorial.aperezsi.domain.errors.GetLightSubWaysError
import com.tutorial.aperezsi.domain.errors.RepositoryError
import com.tutorial.aperezsi.domain.model.LightSubWay
import com.tutorial.aperezsi.domain.result.Either


fun BaseEntityResponse<LightSubwayEntity>.mapToDomain() : Either<GetLightSubWaysError, List<LightSubWay>> {
    return this.features?.let { lightSubwaysEntity ->
        if (lightSubwaysEntity.isEmpty()){
            Either.Failure(GetLightSubWaysError.EmptyData)
        }else {
            Either.Success(lightSubwaysEntity.map {
                    LightSubWay(
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
    } ?: Either.Failure(GetLightSubWaysError.RepositoryFailure(RepositoryError.InvalidRequest))
}