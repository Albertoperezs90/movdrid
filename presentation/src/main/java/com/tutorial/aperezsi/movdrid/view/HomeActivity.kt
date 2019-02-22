package com.tutorial.aperezsi.movdrid.view

import com.tutorial.aperezsi.movdrid.R
import com.tutorial.aperezsi.movdrid.view.base.BaseActivity
import com.tutorial.aperezsi.movdrid.viewmodel.HomeViewModel
import kotlin.reflect.KClass
import com.tutorial.aperezsi.movdrid.databinding.ActivityHomeBinding

class HomeActivity : BaseActivity<HomeViewModel, ActivityHomeBinding>() {

    override fun getLayout(): Int = R.layout.activity_home
    override fun getModel(): KClass<HomeViewModel> = HomeViewModel::class

    override fun setUpBindings() {

    }
}