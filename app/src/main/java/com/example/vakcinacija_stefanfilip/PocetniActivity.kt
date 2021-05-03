package com.example.vakcinacija_stefanfilip

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.pocetni_izgled.*

class PocetniActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pocetni_izgled)

        val fragmentBH = Pocetna_bhFragment();
        val fragmentEN = Pocetna_enFragment();

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.pocetnifragment,fragmentBH);
            commit();
        }

        engleskitranslate.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.pocetnifragment,fragmentEN);
                commit();
            }
        }

        bosanskitranslate.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.pocetnifragment,fragmentBH);
                commit();
            }
        }
    }
}