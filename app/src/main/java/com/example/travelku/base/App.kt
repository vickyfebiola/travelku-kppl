package com.example.travelku.base

import android.app.Application
import com.example.travelku.service.PicassoImageService
import ss.com.bannerslider.Slider

class MyCustomApplication : Application() {
    // Called when the application is starting, before any other application objects have been created.
    // Overriding this method is totally optional!
    override fun onCreate() {
        super.onCreate()
        // Required initialization logic here!
        Slider.init(PicassoImageService(this.applicationContext));

    }

    // This is called when the overall system is running low on memory,
    // and would like actively running processes to tighten their belts.
    // Overriding this method is totally optional!
    override fun onLowMemory() {
        super.onLowMemory()
    }
}