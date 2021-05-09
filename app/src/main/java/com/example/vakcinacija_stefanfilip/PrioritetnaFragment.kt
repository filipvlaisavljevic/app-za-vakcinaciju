package com.example.vakcinacija_stefanfilip

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_prioritetna.*


class PrioritetnaFragment : Fragment(R.layout.fragment_prioritetna) {
    private val args: PrioritetnaFragmentArgs by navArgs()
    private var prioritetna: Boolean = false
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nastavidalje.setOnClickListener {
            val action = PrioritetnaFragmentDirections.actionPrioritetnaFragmentToBolestFragment(
                args.ime,
                args.prezime,
                args.datum,
                args.drzava,
                args.grad,
                args.ulica,
                prioritetna
            )
            findNavController().navigate(action)
        }

        staracki.setOnClickListener {
            postaviPrioritet()
        }

        medicinski.setOnClickListener{
            postaviPrioritet()
        }

        hronicni.setOnClickListener{
            postaviPrioritet()
        }
    }

    fun postaviPrioritet(){
        prioritetna = true
    }

}