package com.tutorial.aperezsi.di.usecase

import com.tutorial.aperezsi.domain.errors.GetBusesError
import com.tutorial.aperezsi.domain.errors.GetLightSubWaysError
import com.tutorial.aperezsi.domain.errors.GetSubUrbansError
import com.tutorial.aperezsi.domain.errors.GetSubWaysError
import com.tutorial.aperezsi.domain.model.Bus
import com.tutorial.aperezsi.domain.model.LightSubWay
import com.tutorial.aperezsi.domain.model.SubUrban
import com.tutorial.aperezsi.domain.model.Subway
import com.tutorial.aperezsi.domain.usecases.GetBusesUseCase
import com.tutorial.aperezsi.domain.usecases.GetLightSubWaysUseCase
import com.tutorial.aperezsi.domain.usecases.GetSubUrbansUseCase
import com.tutorial.aperezsi.domain.usecases.GetSubWaysUseCase
import com.tutorial.aperezsi.domain.usecases.base.UseCaseExecutor
import org.koin.dsl.module.module

val useCaseModule = module {

    factory<UseCaseExecutor<GetBusesError, List<Bus>>>("UseCaseBuses") { GetBusesUseCase(get()) }
    factory<UseCaseExecutor<GetSubUrbansError, List<SubUrban>>>("UseCaseSubUrbans") { GetSubUrbansUseCase(get()) }
    factory<UseCaseExecutor<GetLightSubWaysError, List<LightSubWay>>>("UseCaseLightSubWays")  { GetLightSubWaysUseCase(get()) }
    factory<UseCaseExecutor<GetSubWaysError, List<Subway>>>("UseCaseSubWays") { GetSubWaysUseCase(get()) }
}