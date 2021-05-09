package com.example.vakcinacija_stefanfilip

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_prijava.*


class PrijavaFragment : Fragment(R.layout.fragment_prijava) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        posaljipodatke.setOnClickListener {

            val prezime = prezimetext.text.toString()
            val ime = imetext.text.toString()
            val grad = gradtext.text.toString()
            val ulica = ulicatext.text.toString()
            val datum = datumtext.text.toString()
            val drzava = drzavatext.text.toString()

            val action = PrijavaFragmentDirections.actionPrijavaFragmentToPrioritetnaFragment(ime,prezime,drzava, grad, ulica, datum)

            findNavController().navigate(action)
        }
    }
}