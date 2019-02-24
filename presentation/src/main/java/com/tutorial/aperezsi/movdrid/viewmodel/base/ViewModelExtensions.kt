package com.tutorial.aperezsi.movdrid.viewmodel.base

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

fun BaseViewModel.async(bg: suspend () -> Unit) {
    GlobalScope.launch(Dispatchers.Main) {
        bg()
    }
}