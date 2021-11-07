package com.example.milayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class SegundaActivity : AppCompatActivity() {
    private lateinit var iv_Imagen:ImageView
    private lateinit var btn_Ocultar:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        iv_Imagen = findViewById(R.id.iv_Imagen)
        btn_Ocultar = findViewById(R.id.btn_Ocultar)
    }

    fun ocultar(Vista:View){
        btn_Ocultar.visibility = View.INVISIBLE
        iv_Imagen.visibility = View.VISIBLE
    }

    fun seleccionarFruta(Vista: View){
        when(Vista.id){
            R.id.ibtn_Bananas -> Toast.makeText(this,"Has selecionado Bananas",Toast.LENGTH_SHORT).show()
            R.id.ibtn_Cerezas -> Toast.makeText(this,"Has selecionado Cerezas",Toast.LENGTH_SHORT).show()
            R.id.ibtn_Frambuesas -> Toast.makeText(this,"Has selecionado Frambuesas",Toast.LENGTH_SHORT).show()
            R.id.ibtn_Fresas -> Toast.makeText(this,"Has selecionado Fresas",Toast.LENGTH_SHORT).show()
            R.id.ibtn_Kiwis -> Toast.makeText(this,"Has selecionado Kiwis",Toast.LENGTH_SHORT).show()
            R.id.ibtn_Mango -> Toast.makeText(this,"Has selecionado Mango",Toast.LENGTH_SHORT).show()
            R.id.ibtn_Manzanas -> Toast.makeText(this,"Has selecionado Manzanas",Toast.LENGTH_SHORT).show()
            R.id.ibtn_Melon -> Toast.makeText(this,"Has selecionado Melon",Toast.LENGTH_SHORT).show()
            R.id.ibtn_Naranjas -> Toast.makeText(this,"Has selecionado Naranjas",Toast.LENGTH_SHORT).show()

        }
    }
}