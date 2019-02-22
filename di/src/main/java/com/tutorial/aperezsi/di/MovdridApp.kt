package com.tutorial.aperezsi.di

import android.app.Application
import com.tutorial.aperezsi.di.repository.repositoryModule
import com.tutorial.aperezsi.di.service.dataSource
import com.tutorial.aperezsi.di.usecase.useCaseModule
import com.tutorial.aperezsi.di.viewmodel.viewModelModule
import org.koin.android.ext.android.startKoin

class MovdridApp : Application() {

    override fun onCreate() {
        super.onCreate()

        //Start koin
        startKoin(this, listOf(viewModelModule, useCaseModule, repositoryModule, dataSource))
    }
}