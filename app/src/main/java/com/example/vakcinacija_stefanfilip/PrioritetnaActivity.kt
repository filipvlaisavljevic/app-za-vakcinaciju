package com.example.vakcinacija_stefanfilip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PrioritetnaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.prioritetna_izgled)

        val nastavidalje = findViewById<Button>(R.id.nastavidalje);

        nastavidalje.setOnClickListener {
            val intent = Intent(this,SazetakActivity::class.java);
            startActivity(intent);
        }
    }
}