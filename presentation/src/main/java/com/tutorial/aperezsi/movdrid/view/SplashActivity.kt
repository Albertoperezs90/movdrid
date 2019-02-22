package com.tutorial.aperezsi.movdrid.view

import androidx.lifecycle.Observer
import com.tutorial.aperezsi.movdrid.R
import com.tutorial.aperezsi.movdrid.databinding.ActivitySplashBinding
import com.tutorial.aperezsi.movdrid.navigator.Navigator
import com.tutorial.aperezsi.movdrid.view.base.BaseActivity
import com.tutorial.aperezsi.movdrid.viewmodel.SplashViewModel
import kotlin.reflect.KClass

class SplashActivity : BaseActivity<SplashViewModel, ActivitySplashBinding>() {

    override fun getModel(): KClass<SplashViewModel> = SplashViewModel::class
    override fun getLayout(): Int = R.layout.activity_splash

    override fun setUpBindings() {

        model.data.observe(this, Observer {
            Navigator.goHomeActivity(this, it)
        })
    }
}