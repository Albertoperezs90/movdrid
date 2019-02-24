package com.tutorial.aperezsi.domain.model

data class LightSubWay(
    val stationId: String?,
    val stationName: String?,
    val stationObs: String?,
    val actualDate: String?,
    val codeStation: String?,
    val codeProvince: String?,
    val codeMunicipio: String?,
    val codeEntity: String?,
    val codeCore: String?,
    val codeVia: String?,
    val typeVia: String?,
    val district: String?,
    val taxZone: String?,
    val startDate: String?,
    val startEnd: String?,
    val geometryX: Double?,
    val geometryY: Double?
)