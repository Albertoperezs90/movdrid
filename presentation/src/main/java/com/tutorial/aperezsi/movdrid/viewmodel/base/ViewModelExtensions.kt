package com.tutorial.aperezsi.movdrid.viewmodel.base

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

fun BaseViewModel.async(bg: suspend () -> Unit) {
    GlobalScope.async(Dispatchers.Main) {
        bg()
    }
}