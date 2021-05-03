package com.example.vakcinacija_stefanfilip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PocetniActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pocetni_izgled)

        val zapocniprijavu = findViewById<Button>(R.id.zapocniprijavu);

        zapocniprijavu.setOnClickListener{
            val intent = Intent(this,PrijavaActivity::class.java)
            startActivity(intent)
        }
    }
}