package com.example.vakcinacija_stefanfilip

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_pocetni.*
import kotlinx.android.synthetic.main.fragment_pocetni.engleskitranslate
import kotlinx.android.synthetic.main.fragment_pocetni_e_n.*


class PocetniFragment : Fragment(R.layout.fragment_pocetni) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        engleskitranslate.setOnClickListener {
            val action = PocetniFragmentDirections.actionPocetniFragmentToPocetniENFragment()
            findNavController().navigate(action)
        }

        dugmenastavak.setOnClickListener {
            val action = PocetniFragmentDirections.actionPocetniFragmentToPrijavaFragment()
            findNavController().navigate(action)
        }
    }
}