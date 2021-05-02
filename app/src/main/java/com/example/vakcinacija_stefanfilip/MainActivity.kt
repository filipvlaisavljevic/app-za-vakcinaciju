package com.example.vakcinacija_stefanfilip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pocetni_ekran)

        val zapocniprijavu = findViewById<Button>(R.id.zapocniprijavu);

        zapocniprijavu.setOnClickListener{
            val intent = Intent(this,OsnovneInformacije::class.java)
            startActivity(intent)
        }
    }
}