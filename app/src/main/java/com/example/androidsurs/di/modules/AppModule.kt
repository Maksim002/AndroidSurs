package com.example.androidsurs.di.modules

import android.content.Context
import toothpick.config.Module

/**
 * Project Truck Crew
 * Package ru.telecor.gm.mobile.droid.di.modules
 *
 * Dependencies for the app.
 *
 * Created by Artem Skopincev (aka sharpyx) 16.07.2020
 * Copyright © 2020 TKOInform. All rights reserved.
 */
class AppModule(context: Context) : Module() {

    init {
        bind(Context::class.java).toInstance(context)
    }
}