package com.example.vakcinacija_stefanfilip

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_vakcina.*


class VakcinaFragment : Fragment(R.layout.fragment_vakcina) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        vakcinanastavak.setOnClickListener {
            val action = VakcinaFragmentDirections.actionVakcinaFragmentToSazetakFragment()
            findNavController().navigate(action)
        }

        pogledajstatistiku.setOnClickListener {
            val action = VakcinaFragmentDirections.actionVakcinaFragmentToStatistikaFragment()
            findNavController().navigate(action)
        }
    }
}