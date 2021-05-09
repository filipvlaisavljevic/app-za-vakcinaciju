package com.example.vakcinacija_stefanfilip

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_vakcina.*


class VakcinaFragment : Fragment(R.layout.fragment_vakcina) {
    private val args: VakcinaFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

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
                "Pfizer"
            )
            findNavController().navigate(action)
        }

        pogledajstatistiku.setOnClickListener {
            val action = VakcinaFragmentDirections.actionVakcinaFragmentToStatistikaFragment()
            findNavController().navigate(action)
        }
    }
}