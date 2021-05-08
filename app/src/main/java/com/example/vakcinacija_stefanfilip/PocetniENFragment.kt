package com.example.vakcinacija_stefanfilip

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_pocetni.*
import kotlinx.android.synthetic.main.fragment_pocetni_e_n.*
import kotlinx.android.synthetic.main.fragment_pocetni_e_n.bosanskitranslate


class PocetniENFragment : Fragment(R.layout.fragment_pocetni_e_n) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bosanskitranslate.setOnClickListener {
            val action = PocetniENFragmentDirections.actionPocetniENFragmentToPocetniFragment()
            findNavController().navigate(action)
        }

        buttoncontinue.setOnClickListener {
            val action = PocetniENFragmentDirections.actionPocetniENFragmentToPrijavaFragment()
            findNavController().navigate(action)
        }
    }
}