package com.tutorial.aperezsi.data.remote

import com.tutorial.aperezsi.data.entities.BaseEntityResponse
import com.tutorial.aperezsi.data.entities.LightSubwayEntity
import kotlinx.coroutines.Deferred
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ConsortiumService {


    @GET("Red_MetroLigero/FeatureServer/0/query")
    fun getLightSubway(@Query("where") where: String = "1%3D1",
                       @Query("outFields") outFields: String = "*",
                       @Query("outSR") outSR: Int = 4326,
                       @Query("f") format: String = "json") : Deferred<BaseEntityResponse<LightSubwayEntity>>
}