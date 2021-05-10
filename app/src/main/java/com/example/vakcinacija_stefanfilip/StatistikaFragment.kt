package com.example.vakcinacija_stefanfilip

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import kotlinx.android.synthetic.main.fragment_statistika.*

class StatistikaFragment : Fragment(R.layout.fragment_statistika) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    setBarChart()
}

private fun setBarChart() {
    val entries = ArrayList<BarEntry>()
    entries.add(BarEntry(8f, 0))
    entries.add(BarEntry(2f, 1))
    entries.add(BarEntry(5f, 2))
    entries.add(BarEntry(20f, 3))


    val barDataSet = BarDataSet(entries, "Broj dosad odabranih vakcina")

    val labels = ArrayList<String>()
    labels.add("Pfizer")
    labels.add("Sputnik V")
    labels.add("Moderna")
    labels.add("AstraZeneca")

    val data = BarData(labels, barDataSet)
    barChart.data = data // set the data and list of lables into chart

    barChart.setDescription("#vakcinisise")  // set the description

    //barDataSet.setColors(ColorTemplate.COLORFUL_COLORS)
    barDataSet.color = resources.getColor(R.color.btn_color)

    barChart.animateY(2000)
}

}