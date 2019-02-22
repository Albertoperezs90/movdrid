package com.tutorial.aperezsi.movdrid.navigator

import android.content.Context
import android.content.Intent
import com.tutorial.aperezsi.movdrid.entities.ConsortiumTransport
import com.tutorial.aperezsi.movdrid.util.Constants.CONSORTIUM_TRANSPORT
import com.tutorial.aperezsi.movdrid.view.HomeActivity
import com.tutorial.aperezsi.movdrid.view.SplashActivity

object Navigator {

    fun goSplashActivity(context: Context){
        val intent = Intent(context, SplashActivity::class.java)
        context.startActivity(intent)
    }


    fun goHomeActivity(context: Context, data: ConsortiumTransport){
        val intent = Intent(context, HomeActivity::class.java)
        intent.putExtra(CONSORTIUM_TRANSPORT, data)
        arrayListOf<Int>().apply {
            Intent.FLAG_ACTIVITY_CLEAR_TOP
            Intent.FLAG_ACTIVITY_CLEAR_TASK
            Intent.FLAG_ACTIVITY_NEW_TASK
        }.let {
            it.forEach { flag -> intent.flags = flag }
        }
        context.startActivity(intent)
    }
}