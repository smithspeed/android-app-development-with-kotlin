package com.example.kotlintutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.kotlintutorial.databinding.ActivityMainBinding
import com.example.kotlintutorial.databinding.ActivityViewBindingMainBinding

class ViewBindingMainActivity : AppCompatActivity() {

    //should be like MainActivity -> ActivityMainBinding , XyzActivity -> ActivityXyzBinding
    lateinit var mainBinding: ActivityViewBindingMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainBinding = ActivityViewBindingMainBinding.inflate(layoutInflater)
        val view = mainBinding.root
        setContentView(view)

        mainBinding.buttonOk.setOnClickListener {

            mainBinding.textView2.text = mainBinding.editTextText.text.toString()

        }
    }
}