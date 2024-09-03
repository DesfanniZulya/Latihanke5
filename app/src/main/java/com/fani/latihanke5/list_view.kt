package com.fani.latihanke5

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class list_view : AppCompatActivity() {
    private lateinit var lv_item : ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_view)
        lv_item = findViewById(R.id.btnlistview)

        val namaHewan = listOf("Gajah", "Kucing","Kupu-kupu","kelinci","kambing","sapi")
        lv_item.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, namaHewan)
    }
}