package com.fani.latihanke5

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Luas_volume : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_luas_volume)

        val etPanjang = findViewById<EditText>(R.id.etPanjang)
        val etLebar = findViewById<EditText>(R.id.etLebar)
        val etTinggi = findViewById<EditText>(R.id.etTinggi)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnCalculate.setOnClickListener{
            val panjang = etPanjang.text.toString().toDouble()
            val lebar = etLebar.text.toString().toDouble()
            val tinggi = etTinggi.text.toString().toDouble()

            val luasPermukaan = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi)
            val volume = panjang * lebar * tinggi

            tvResult.text = "Luas Permukaan: $luasPermukaan\nVolume: $volume"
        }
    }
}
