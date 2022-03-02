package com.example.prueba

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val numberRandom = Random.nextInt(0,1000)

    fun getNumber(vista: View){
        val ntxt = findViewById<EditText>(R.id.number).text.toString()
        val n = Integer.valueOf(ntxt)
        val a = vista as Button
        if(n.toInt() > numberRandom && a.text.toString() == "Adivinar"){
            Toast.makeText(this, "Te pasaste...", Toast.LENGTH_LONG).show() //Mostrar texto en pantalla
        }else if(n.toInt() < numberRandom && a.text.toString() == "Adivinar"){
            Toast.makeText(this, "Te quedaste...", Toast.LENGTH_LONG).show()
        }else if(n.toInt() == numberRandom && a.text.toString() == "Adivinar"){
            Toast.makeText(this, "¡Felicitaciones! Adivinaste el número", Toast.LENGTH_LONG).show()
        }
    }
}
