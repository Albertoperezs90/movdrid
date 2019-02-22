package com.tutorial.aperezsi.di.viewmodel

import com.tutorial.aperezsi.movdrid.viewmodel.SplashViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val viewModelModule = module {
    viewModel { SplashViewModel(get()) }
}