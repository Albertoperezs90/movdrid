package com.tutorial.aperezsi.di.repository

import com.tutorial.aperezsi.data.repository.BusRepository
import com.tutorial.aperezsi.data.repository.LightSubWayRepository
import com.tutorial.aperezsi.data.repository.SubUrbanRepository
import com.tutorial.aperezsi.data.repository.SubwayRepository
import com.tutorial.aperezsi.domain.repository.IBusRepository
import com.tutorial.aperezsi.domain.repository.ILightSubWayRepository
import com.tutorial.aperezsi.domain.repository.ISubUrbanRepository
import com.tutorial.aperezsi.domain.repository.ISubwayRepository
import org.koin.dsl.module.module

val repositoryModule = module {
    single<IBusRepository> { BusRepository() }
    single<ISubUrbanRepository> { SubUrbanRepository() }
    single<ILightSubWayRepository> { LightSubWayRepository() }
    single<ISubwayRepository> { SubwayRepository() }
}