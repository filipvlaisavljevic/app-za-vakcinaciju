package com.example.vakcinacija_stefanfilip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry

class StatistikaActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.statistika_izgled);
        postaviStatistiku();
    }

private fun postaviStatistiku() {
    val stupac = findViewById<View>(R.id.barChart) as BarChart
    val vrijednosti = ArrayList<BarEntry>()
    vrijednosti.add(BarEntry(8f, 0))
    vrijednosti.add(BarEntry(6f, 1))
    vrijednosti.add(BarEntry(9f, 2))
    vrijednosti.add(BarEntry(13f, 3))
    //vrijednosti.add(BarEntry(11f, 4))



    val podaciStupca = BarDataSet(vrijednosti, "Statistička raspodjela odabira vakcina")

    val vakcine = ArrayList<String>()
    vakcine.add("AstraZeneca")
    vakcine.add("Pfizer")
    vakcine.add("Sputnik V")
    vakcine.add("Moderna")
    // vakcine.add("Janssen")

    val podaci = BarData(vakcine, podaciStupca)
    stupac.data = podaci

     stupac.setDescription("#vakcinišise")


    podaciStupca.color = resources.getColor(R.color.teal_700)

    stupac.animateY(2000)
}


}

