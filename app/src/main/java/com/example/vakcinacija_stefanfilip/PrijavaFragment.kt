package com.example.vakcinacija_stefanfilip

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_prijava.*


class PrijavaFragment : Fragment(R.layout.fragment_prijava) {
    private var ime: String = ""
    private var prezime: String = ""
    private var grad: String = ""
    private var datum: String = ""
    private var drzava: String = ""
    private var ulica: String = ""

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        posaljipodatke.setOnClickListener {

            prezime = prezimetext.text.toString()
            ime = imetext.text.toString()
            grad = gradtext.text.toString()
            ulica = ulicatext.text.toString()
            datum = datumtext.text.toString()
            drzava = drzavatext.text.toString()

            var action = PrijavaFragmentDirections.actionPrijavaFragmentToPrioritetnaFragment(
                ime,
                prezime,
                drzava,
                grad,
                ulica,
                datum)
            if(!drzava.equals("Bosna i Hercegovina"))
                action = PrijavaFragmentDirections.actionPrijavaFragmentToGreskaFragment()

            findNavController().navigate(action)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("ime",ime)
        outState.putString("prezime",prezime)
        outState.putString("grad",grad)
        outState.putString("ulica",ulica)
        outState.putString("datum",datum)
        outState.putString("drzava",drzava)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        if (savedInstanceState != null) {
            ime = savedInstanceState.getString("ime").toString()
            prezime = savedInstanceState.getString("prezime").toString()
            grad = savedInstanceState.getString("grad").toString()
            ulica = savedInstanceState.getString("ulica").toString()
            datum = savedInstanceState.getString("datum").toString()
            drzava = savedInstanceState.getString("drzava").toString()
        }
    }
}