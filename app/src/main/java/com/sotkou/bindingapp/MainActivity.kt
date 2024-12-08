package com.sotkou.bindingapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.sotkou.bindingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val car1 = Vehicle()
        //binding.helloText.text = car1.name
        binding.myCar = car1

        // χειρισμός των click
        //binding.button.setOnClickListener {
        //    Toast.makeText(this, "You clicked the button!", Toast.LENGTH_SHORT).show()
        
        binding.clickHandler = ClickHandlers(this)

        }

    }
