package com.example.kotlintutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var startClassicService:Button
    lateinit var startJobIntentService:Button
    lateinit var stopClassicService:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service_main)

        startClassicService = findViewById(R.id.startClassicService)

        startJobIntentService = findViewById(R.id.startJobIntentService)

        stopClassicService = findViewById(R.id.stopService)

        startClassicService.setOnClickListener {

            val intent = Intent(this@ServiceMainActivity, ClassicServiceExample::class.java)
            startService(intent)

        }

        startJobIntentService.setOnClickListener {

            val intent = Intent(this@ServiceMainActivity, JobIntentServiceExample::class.java)
            JobIntentServiceExample.myBackgroundServices(this@ServiceMainActivity, intent)
        }

        stopClassicService.setOnClickListener {

            val intent = Intent(this@ServiceMainActivity, ClassicServiceExample::class.java)
            stopService(intent)

        }
    }
}