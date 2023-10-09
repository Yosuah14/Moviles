package com.example.variosactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.variosactivity.databinding.ActivityMainBinding

class Ventana22 : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}