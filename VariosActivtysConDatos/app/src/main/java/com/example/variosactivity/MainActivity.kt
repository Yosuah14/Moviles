package com.example.variosactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.variosactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.boton.setOnClickListener{
            abrirVentana2()
        }


    }

    private fun abrirVentana2() {
        var miIntnet:Intent= Intent(this,Ventana22::class.java)
        miIntnet.putExtra("nombre",binding.cajaNombre.text.toString())
        miIntnet.putExtra("edad",binding.cajaEdad.text.toString())
        startActivity(miIntnet)
    }
}