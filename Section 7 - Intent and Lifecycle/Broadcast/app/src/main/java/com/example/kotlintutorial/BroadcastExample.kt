package com.example.kotlintutorial

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class BroadcastExample : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {

        val isAirplaneMode:Boolean = intent!!.getBooleanExtra("state",false)

        if(isAirplaneMode){

            Toast.makeText(context, "the device is in airplane mode", Toast.LENGTH_LONG ).show();

        }
        else{
            Toast.makeText(context, "the device is not in airplane mode", Toast.LENGTH_LONG ).show();

        }
    }


}