package com.example.kotlintutorial

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    // register the receiver in the main activity in order
    // to receive updates of broadcasts events if they occur
    lateinit var receiver: BroadcastExample
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_broadcast_receiver_main)

        receiver = BroadcastExample()
    }

    override fun onStart() {
        super.onStart()
        val filter = IntentFilter()
        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        this.registerReceiver(receiver, filter)
    }

    override fun onStop() {
        super.onStop()

        this.unregisterReceiver(receiver)
    }
}