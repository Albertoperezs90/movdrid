package com.tutorial.aperezsi.movdrid.viewmodel

import androidx.lifecycle.MutableLiveData
import com.tutorial.aperezsi.domain.errors.GetBusesError
import com.tutorial.aperezsi.domain.errors.GetLightSubWaysError
import com.tutorial.aperezsi.domain.errors.GetSubUrbansError
import com.tutorial.aperezsi.domain.errors.GetSubWaysError
import com.tutorial.aperezsi.domain.model.Bus
import com.tutorial.aperezsi.domain.model.LightSubWay
import com.tutorial.aperezsi.domain.model.SubUrban
import com.tutorial.aperezsi.domain.model.Subway
import com.tutorial.aperezsi.domain.result.fold
import com.tutorial.aperezsi.domain.usecases.base.UseCaseExecutor
import com.tutorial.aperezsi.movdrid.entities.ConsortiumTransport
import com.tutorial.aperezsi.movdrid.viewmodel.base.BaseViewModel
import com.tutorial.aperezsi.movdrid.viewmodel.base.async


class SplashViewModel(
    val getBusesUseCase: UseCaseExecutor<GetBusesError, List<Bus>>,
    val getSubUrbansUseCase: UseCaseExecutor<GetSubUrbansError, List<SubUrban>>,
    val getSubWayUseCase: UseCaseExecutor<GetSubWaysError, List<Subway>>,
    val getLightSubWayUseCase: UseCaseExecutor<GetLightSubWaysError, List<LightSubWay>>
) : BaseViewModel() {

    var data: MutableLiveData<ConsortiumTransport> = MutableLiveData()
        private set

    override fun init() {
        async {
            val buses = getBusesUseCase.execute()
            val subUrban = getSubUrbansUseCase.execute()
            val subWay = getSubWayUseCase.execute()
            val lightSubWay = getLightSubWayUseCase.execute()

            buses.fold( { /* HANDLER ERROR */ },
                        { /* HANDLER SUCCESS */ })

            subUrban.fold( { /* HANDLER ERROR */ },
                        { /* HANDLER SUCCESS */ })

            subWay.fold( { /* HANDLER ERROR */ },
                        { /* HANDLER SUCCESS */ })

            lightSubWay.fold( { /* HANDLER ERROR */ },
                        { /* HANDLER SUCCESS */ })
        }
    }
}