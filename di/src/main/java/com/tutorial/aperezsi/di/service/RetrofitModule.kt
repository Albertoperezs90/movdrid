package com.tutorial.aperezsi.di.service

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.tutorial.aperezsi.data.BuildConfig
import com.tutorial.aperezsi.data.remote.ConsortiumService
import okhttp3.OkHttpClient
import org.koin.dsl.module.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


private const val connectTimeout = 60L
private const val readTimeout = 60L

val dataSource = module {

    single { createOkHttpClient() }

    single { createApiClient<ConsortiumService>(get()) }
}


private fun createOkHttpClient() : OkHttpClient {
    return OkHttpClient.Builder()
        .connectTimeout(connectTimeout, TimeUnit.SECONDS)
        .readTimeout(readTimeout, TimeUnit.SECONDS)
        .build()
}

inline fun <reified T> createApiClient(okHttpClient: OkHttpClient) : T {
    val retrofit = Retrofit.Builder()
        .baseUrl(BuildConfig.BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(CoroutineCallAdapterFactory())
        .build()

    return retrofit.create(T::class.java)
}


