package com.tutorial.aperezsi.data.mappers

import com.tutorial.aperezsi.data.entities.BaseEntityResponse
import com.tutorial.aperezsi.data.entities.LightSubwayEntity
import com.tutorial.aperezsi.domain.entities.ConsortiumEntity

fun BaseEntityResponse<LightSubwayEntity>.mapToDomain() : ConsortiumEntity{
    return ConsortiumEntity().apply {
        this.prueba = this@mapToDomain.features?.get(0)?.attributes?.CODIGOESTACION ?: ""
    }
}