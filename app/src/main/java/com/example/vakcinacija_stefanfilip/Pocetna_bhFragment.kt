package com.example.vakcinacija_stefanfilip

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.pocetna_bh_fragment.*


class Pocetna_bhFragment : Fragment(R.layout.pocetna_bh_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttoncontinue.setOnClickListener {
            val akcija = Pocetna_bhFragmentDirections.actionPocetnaBhFragmentToBlankfragment2();
            findNavController().navigate(akcija,null);
        }
    }
}