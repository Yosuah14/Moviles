package com.example.variosactivity

import Modelo.Persona
import Modelo.Personas
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.variosactivity.databinding.ActivityMainBinding

class Ventana22 : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var nombre = intent.getStringExtra("nombre")
        var edad = intent.getStringExtra("edad")
        binding.cajaNombre.setText(nombre)
        binding.cajaNombre.setText(edad)
        var persona: Persona = Persona(nombre,edad)
    binding.cajaEdad.setText()
        binding.boton.setOnClickListener{
            finish()
    }
    }
}