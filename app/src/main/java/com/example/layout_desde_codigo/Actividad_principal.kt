package com.example.layout_desde_codigo

import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.core.content.ContextCompat

class Actividad_principal:AppCompatActivity() {
    lateinit var texto1: TextView
    lateinit var texto2: TextView
    lateinit var boton:Button
    lateinit var contenedor: LinearLayoutCompat




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        inicializarComponentes()

        setContentView(this.contenedor)

    }

    private fun inicializarComponentes() {
        //Instancio objetos TextView
        texto1 =  TextView(this)
        texto2 = TextView(this)

        boton=Button(this)


        //Instancio el contenedor
        contenedor = LinearLayoutCompat(this)
        //Asigno valores a los atributos de los componentes
        texto1.setText("Campo de texto1")
        this.texto2.setText("Campo de texto2")
        this.contenedor.setBackgroundColor(ContextCompat.getColor(this,R.color.red))
        this.contenedor.setOrientation(LinearLayoutCompat.VERTICAL)
        this.boton.text="PULSAME!"
        this.boton.layoutParams=LinearLayoutCompat.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT,
            1F
        )

        this.boton.setOnClickListener {
            this.texto1.setBackgroundColor(ContextCompat.getColor(this,R.color.white))


        }

        this.texto2.layoutParams= LinearLayoutCompat.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT,
            1F
        )

        this.texto1.layoutParams= LinearLayoutCompat.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT,
            1F
        )

        this.contenedor.addView(this.texto1)
        this.contenedor.addView(this.texto2)
        this.contenedor.addView(this.boton)
    }
}