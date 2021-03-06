package com.example.vakcinacija_stefanfilip

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_vakcina.*


class VakcinaFragment : Fragment(R.layout.fragment_vakcina) {
    private val args: VakcinaFragmentArgs by navArgs()
    private var vakcina: String = ""
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if(pfizer.isChecked)
            vakcina = "Pfizer"
        else if(moderna.isChecked)
            vakcina = "Moderna"
        else if(sputnik.isChecked)
            vakcina = "Sputnik"
        else if(astrazeneca.isChecked)
            vakcina = "Astra Zeneca"

        vakcinanastavak.setOnClickListener {
            val action = VakcinaFragmentDirections.actionVakcinaFragmentToSazetakFragment(
                args.ime,
                args.prezime,
                args.datum,
                args.drzava,
                args.grad,
                args.ulica,
                args.prioritet,
                args.bolest,
                vakcina + " vakcina"
            )
            findNavController().navigate(action)
        }

        pogledajstatistiku.setOnClickListener {
            val action = VakcinaFragmentDirections.actionVakcinaFragmentToStatistikaFragment()
            findNavController().navigate(action)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putString("vakcina",vakcina)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)

        if (savedInstanceState != null) {
            vakcina = savedInstanceState.getString("vakcina").toString()
        }
    }
}