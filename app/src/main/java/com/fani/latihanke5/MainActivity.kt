package com.fani.latihanke5

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnKonversiSuhu = findViewById<Button>(R.id.btnKonversiSuhu)
        val btnDiskon = findViewById<Button>(R.id.btnDiskon)
        val btnLuasVolume = findViewById<Button>(R.id.btnLuasVolume)
        val btnGanjilGenap = findViewById<Button>(R.id.btnGanjilGenap)
        val btnPassingData = findViewById<Button>(R.id.btnPassingData)
        val btnListView = findViewById<Button>(R.id.btnListView)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnKonversiSuhu.setOnClickListener {
            startActivity(Intent(this, konversi_suhu::class.java))
        }

        btnDiskon.setOnClickListener {
            startActivity(Intent(this, Diskon::class.java))
        }

        btnLuasVolume.setOnClickListener {
            startActivity(Intent(this, Luas_volume::class.java))
        }

        btnGanjilGenap.setOnClickListener {
            startActivity(Intent(this, Ganjil_Genap::class.java))
        }
        btnPassingData.setOnClickListener {
            startActivity(Intent(this, passing_data::class.java))
        }
        btnListView.setOnClickListener {
            startActivity(Intent(this, list_view::class.java))
        }
    }
}