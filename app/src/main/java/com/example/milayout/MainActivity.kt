package com.example.milayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tv_Mostrar: TextView
    private lateinit var lv_Lista : ListView

    private val nombre = arrayOf("Fatima","Andres","Enmanuel","Rafael","Luis","Kevin","Abigail","Valentina","sofia","Jasmin")
    private val edad = arrayOf("18","25","32","17","24","20","27","30","15","23")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_Mostrar = findViewById(R.id.tv_Mostrar)
        lv_Lista = findViewById(R.id.lv_Lista)

        val adaptador = ArrayAdapter(this, android.R.layout.simple_list_item_1,nombre)
        lv_Lista.adapter = adaptador

        lv_Lista.setOnItemClickListener { adapterView, view, i, l ->
            tv_Mostrar.setText("La edad de "+lv_Lista.getItemAtPosition(i)+ " es "+edad[i]+" años")
        }


    }



    fun siguienteActividad(Vista: View){
        val siguienteActivity = Intent(this,SegundaActivity::class.java)
        startActivity(siguienteActivity)
    }



}