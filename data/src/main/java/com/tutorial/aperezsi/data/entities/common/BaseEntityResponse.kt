package com.tutorial.aperezsi.data.entities.common

data class BaseEntityResponse<T>(
    val objectIdFieldName: String? = null,
    val uniqueIdField: UniqueIdField? = null,
    val globalIdFieldName: String? = null,
    val geometryType: String? = null,
    val spatialReference: SpatialReference? = null,
    val fields: List<Fields>? = null,
    val features: List<T>? = null
)



data class UniqueIdField(
    val name: String? = null,
    val isSystemMaintained: Boolean? = null
)



data class SpatialReference(
    val wkid: Long? = null,
    val latestWkid: Long? = null
)


data class Fields(
    val name: String? = null,
    val type: String? = null,
    val alias: String? = null,
    val sqlType: String? = null,
    val domain: String? = null,
    val defaultValue: String? = null
)