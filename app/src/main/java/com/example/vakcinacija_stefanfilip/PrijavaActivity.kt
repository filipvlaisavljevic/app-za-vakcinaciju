package com.example.vakcinacija_stefanfilip
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class PrijavaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.prijava_izgled)


        val posaljipodatke = findViewById<Button>(R.id.posaljipodatke);

        posaljipodatke.setOnClickListener {
            val intent = Intent(this, PrioritetnaActivity::class.java);
            startActivity(intent);
        }
    }
}