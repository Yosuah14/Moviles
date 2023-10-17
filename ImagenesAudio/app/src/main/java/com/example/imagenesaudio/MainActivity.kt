package com.example.imagenesaudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.imagenesaudio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.starbutton.setOnClickListener{
            binding.sickview.setImageResource(R.drawable.estoymalito)
        }
        binding.xbuton.setOnClickListener{
            binding.sickview.setImageResource(R.drawable.baseline_sports_bar_24)
        }

    }
}