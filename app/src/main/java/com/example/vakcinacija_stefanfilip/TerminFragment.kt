package com.example.vakcinacija_stefanfilip

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_termin.*
import kotlin.random.Random


class TerminFragment : Fragment(R.layout.fragment_termin) {
    private var prijavljeni: Int = 120000
    private var dan: Int = 0
    private var mjesec: Int = 0
    private var godina: Int = 0
    private var sat: Int = 0
    private var datum: String = ""
    private var bolnice = arrayOf<String>("Vojna bolnica, Sarajevo", "Klinički centar, Sarajevo", "Punkt Zetra, Sarajevo", "Punkt BBI,Sarajevo")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        napraviTermin()
        startTimeCounter(view)

        sharebutton.setOnClickListener{ view ->
            val sendIntent = Intent()
            sendIntent.action = Intent.ACTION_SEND
            sendIntent.putExtra(
                Intent.EXTRA_TEXT,
                "Upravo sam zakazao termin za vakcinaciju koristeći novu aplikaciju. Budi odgovoran i zakaži i ti svoj termin! Vakcinišem se: "
            + datum + "!"
            )
            sendIntent.type = "text/plain"
            startActivity(sendIntent)
        }
    }

    fun napraviTermin(){
        dan = (0 until 28).random()
        godina = (2021 until 2023).random()
        if(godina == 2021)
            mjesec = (6 until 12).random()
        else mjesec = (1 until 12).random()

        sat = (8 until 18).random()

        datum = dan.toString() + "/" + mjesec.toString() + "/" + godina.toString() + " u " + sat.toString() + ":00 h"
        vrijemevakcinacije.text = datum

        val gdje = (0 until 3).random()
        lokacija_vakcinacije_pravo.text = bolnice[gdje]
    }

    fun startTimeCounter(view: View) {
        object : CountDownTimer(125000, 3000) {
            override fun onTick(millisUntilFinished: Long) {
                prijavljeni += (0 until 500).random()
                brojac.text = prijavljeni.toString()
            }
            override fun onFinish() {
                brojac.text = prijavljeni.toString()
            }
        }.start()
    }
}