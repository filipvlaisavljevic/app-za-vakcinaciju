package com.example.vakcinacija_stefanfilip

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_prioritetna.*


class PrioritetnaFragment : Fragment(R.layout.fragment_prioritetna) {
    private val args: PrioritetnaFragmentArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nastavidalje.setOnClickListener {
            val action = PrioritetnaFragmentDirections.actionPrioritetnaFragmentToBolestFragment(args.ime,args.prezime,args.datum,args.drzava,args.grad,args.ulica)
            findNavController().navigate(action)
        }
    }
}