package com.example.apppizzaria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apppizzaria.databinding.ActivityMainBinding
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var clicked = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btAll.setOnClickListener {
            clicked = true
            if (clicked){
                binding.btAll
            }
            }
        }


    }
