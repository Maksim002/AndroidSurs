package com.example.androidsurs

import android.app.Application
import com.example.androidsurs.di.Scopes
import com.example.androidsurs.di.modules.AppModule
import toothpick.Toothpick

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        initAppScope()
    }

    private fun initAppScope() {
        val appScope = Toothpick.openScope(Scopes.APP_SCOPE)
        appScope.installModules(AppModule(this))
    }
}