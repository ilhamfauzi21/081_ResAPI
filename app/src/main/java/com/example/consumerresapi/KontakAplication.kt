package com.example.consumerresapi

import android.app.Application
import com.example.consumerresapi.repository.AppContainer
import com.example.consumerresapi.repository.KontakContainer

class KontakAplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = KontakContainer()
    }
}