package com.tutorial.aperezsi.movdrid.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.tutorial.aperezsi.domain.entities.Result
import com.tutorial.aperezsi.domain.usecases.IConsortiumUseCase
import com.tutorial.aperezsi.movdrid.entities.ConsortiumTransport
import com.tutorial.aperezsi.movdrid.viewmodel.base.BaseViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class SplashViewModel(val useCase: IConsortiumUseCase) : BaseViewModel() {

    var data: MutableLiveData<ConsortiumTransport> = MutableLiveData()
        private set

    override fun init() {
        GlobalScope.launch(Dispatchers.Main) {
            val result = useCase.getData()
            when (result){
                is Result.Success -> Log.wtf("**TAG**", result.value.prueba)
                is Result.Failure -> Log.d("error", result.error)
                is Result.Loading -> {}
            }
        }
    }
}