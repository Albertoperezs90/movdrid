package com.tutorial.aperezsi.di.usecase

import com.tutorial.aperezsi.domain.usecases.ConsortiumUseCase
import com.tutorial.aperezsi.domain.usecases.IConsortiumUseCase
import org.koin.dsl.module.module

val useCaseModule = module {

    single<IConsortiumUseCase> { ConsortiumUseCase(get()) }

}