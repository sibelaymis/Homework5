package com.patika.homework5

import android.app.Application
import com.patika.homework4.service.ServiceConnector

class Application : Application() {

    override fun onCreate() {
        super.onCreate()
        ServiceConnector.init()
    }
}