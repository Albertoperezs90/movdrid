package com.tutorial.aperezsi.movdrid.viewmodel.base

import androidx.lifecycle.ViewModel

abstract class BaseViewModel : ViewModel() {

    override fun onCleared() {
        super.onCleared()
    }

    abstract fun init()
}