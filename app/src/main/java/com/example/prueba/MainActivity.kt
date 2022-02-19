package com.example.prueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val arriba = Random.nextInt(0,100)
    val abajo = Random.nextInt(0,100)
    fun getNumber(vista: View){
        val a = vista as Button
        if(arriba > abajo && a.text.toString() == "Arriba"){
            Toast.makeText(this, "Ganador arriba", Toast.LENGTH_LONG).show() //Mostrar texto en pantalla
        }else if(abajo > arriba && a.text.toString() == "Abajo"){
            Toast.makeText(this,"Ganador abajo", Toast.LENGTH_LONG).show() //Mostrar texto en pantalla
        }else{
            Toast.makeText(this, "Perdedor", Toast.LENGTH_LONG).show() //Mostrar texto en pantalla
        }
    }
}
