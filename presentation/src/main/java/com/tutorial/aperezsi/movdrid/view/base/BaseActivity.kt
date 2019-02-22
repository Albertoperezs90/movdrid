package com.tutorial.aperezsi.movdrid.view.base

import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.databinding.library.baseAdapters.BR
import com.tutorial.aperezsi.movdrid.viewmodel.base.BaseViewModel
import org.koin.android.viewmodel.ext.android.viewModelByClass
import kotlin.reflect.KClass

abstract class BaseActivity<M: BaseViewModel, B: ViewDataBinding> : AppCompatActivity() {

    protected val model by viewModelByClass(getModel())

    protected val binding: B by lazy {
        DataBindingUtil.setContentView<B>(this, getLayout())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE)
        super.onCreate(savedInstanceState)
        binding.setLifecycleOwner(this)
        binding.setVariable(BR.model, model)
        setUpBindings()
        model.init()
    }

    abstract fun getLayout() : Int
    abstract fun getModel() : KClass<M>
    abstract fun setUpBindings()
}