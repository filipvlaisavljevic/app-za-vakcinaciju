package com.example.vakcinacija_stefanfilip

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_bolest.*


class BolestFragment : Fragment(R.layout.fragment_bolest) {
    private val args: BolestFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bolovanje_submit.setOnClickListener {
            var bolujemod = bolujem_od.text.toString()

            if(bolujemod.equals("Bolujem od..."))
                bolujemod = "/"
            val action = BolestFragmentDirections.actionBolestFragmentToVakcinaFragment(
                args.ime,
                args.prezime,
                args.datum,
                args.drzava,
                args.grad,
                args.ulica,
                args.prioritet,
                bolujemod
            )
            findNavController().navigate(action)
        }
    }
}