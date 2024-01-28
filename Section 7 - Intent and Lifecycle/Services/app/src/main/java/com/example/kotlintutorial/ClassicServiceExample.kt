package com.example.kotlintutorial

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class ClassicServiceExample: Service() {

    /**
     * Classic Service class use main thread
     */

    override fun onBind(intent: Intent?): IBinder? {
        return null

    }

    override fun onCreate() {
        super.onCreate()
        log("Classic Service is created")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        log("Classic Service is started")

        Log.d("*ServiceThread", Thread.currentThread().name)

        //stopSelf() //service will stop after completing the task

        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        log("BackgroundTaskService says goodbye!")
    }

    fun log(str:String){
        Log.d("*BasicServices", "log: $str")
    }

}