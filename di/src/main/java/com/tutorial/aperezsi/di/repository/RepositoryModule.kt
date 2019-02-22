package com.tutorial.aperezsi.di.repository

import com.tutorial.aperezsi.data.repository.ConsortiumRepository
import com.tutorial.aperezsi.domain.repository.IConsortiumRepository
import org.koin.dsl.module.module

val repositoryModule = module {
    single<IConsortiumRepository> { ConsortiumRepository() }
}