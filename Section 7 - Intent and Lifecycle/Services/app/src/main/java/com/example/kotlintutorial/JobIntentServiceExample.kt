package com.example.kotlintutorial

import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.core.app.JobIntentService

class JobIntentServiceExample: JobIntentService() {

    /**
     * Intent Service class use own thread
     */

    override fun onHandleWork(intent: Intent) {

        log("Job Intent Service is create")

        Log.d("*ServiceThread", Thread.currentThread().name)
    }

    //help to use as static method
    companion object{

        fun myBackgroundServices(context: Context, intent: Intent){

            enqueueWork(context, JobIntentServiceExample::class.java, 1, intent)
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        log("Job Intent services says goodbye!")
    }

    fun log(str:String){
        Log.d("*IntentServices", "log: $str")
    }
}