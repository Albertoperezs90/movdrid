package com.tutorial.aperezsi.data.remote

import com.tutorial.aperezsi.data.entities.BusEntity
import com.tutorial.aperezsi.data.entities.LightSubwayEntity
import com.tutorial.aperezsi.data.entities.SubUrbanEntity
import com.tutorial.aperezsi.data.entities.SubwayEntity
import com.tutorial.aperezsi.data.entities.common.BaseEntityResponse
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

interface ConsortiumService {


    @GET("Red_MetroLigero/FeatureServer/0/query")
    fun getLightSubways(@Query("where", encoded=true) where: String = "1%3D1",
                       @Query("outFields") outFields: String = "*",
                       @Query("outSR") outSR: Int = 4326,
                       @Query("f") format: String = "json") : Deferred<BaseEntityResponse<LightSubwayEntity>>

    @GET("Red_Metro/FeatureServer/0/query")
    fun getSubWays(@Query("where", encoded=true) where: String = "1%3D1",
                   @Query("outFields") outFields: String = "*",
                   @Query("outSR") outSR: Int = 4326,
                   @Query("f") format: String = "json") : Deferred<BaseEntityResponse<SubwayEntity>>

    @GET("M9_Red/FeatureServer/0/query")
    fun getBuses(@Query("where", encoded=true) where: String = "1%3D1",
                 @Query("outFields") outFields: String = "*",
                 @Query("outSR") outSR: Int = 4326,
                 @Query("f") format: String = "json") : Deferred<BaseEntityResponse<BusEntity>>


    @GET("M8_Red/FeatureServer/0/query")
    fun getSubUrbans(@Query("where", encoded=true) where: String = "1%3D1",
                       @Query("outFields") outFields: String = "*",
                       @Query("outSR") outSR: Int = 4326,
                       @Query("f") format: String = "json") : Deferred<BaseEntityResponse<SubUrbanEntity>>
}