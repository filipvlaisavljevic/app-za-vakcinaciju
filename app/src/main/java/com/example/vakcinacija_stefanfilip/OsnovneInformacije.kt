package com.example.vakcinacija_stefanfilip
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.FirebaseDatabase


class OsnovneInformacije : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.osnovne_informacije)


        val posaljipodatke = findViewById<Button>(R.id.posaljipodatke);

        posaljipodatke.setOnClickListener {
            val intent = Intent(this, PrioritetnaGrupa::class.java);
            startActivity(intent);
        }
    }
}