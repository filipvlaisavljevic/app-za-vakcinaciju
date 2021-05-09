package com.example.vakcinacija_stefanfilip

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_prijava.*
import kotlinx.android.synthetic.main.fragment_sazetak.*


class SazetakFragment : Fragment(R.layout.fragment_sazetak) {
    private val args: SazetakFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sazetakdugme.setOnClickListener {
            val action = SazetakFragmentDirections.actionSazetakFragmentToTerminFragment()
            findNavController().navigate(action)
        }

        imeprezimeprikaz.text = args.ime + " " + args.prezime
        datumprikaz.text = args.datum
        ulicaprikaz.text = args.ulica
        gradprikaz.text = args.grad
        if(bolestprikaz != null)
            bolestprikaz.text = args.bolest
        if(args.prioritet)
            prioritetprikaz.text = "Da"
    }
}