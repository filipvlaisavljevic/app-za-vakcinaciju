package com.example.vakcinacija_stefanfilip

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_prioritetna.*


class PrioritetnaFragment : Fragment(R.layout.fragment_prioritetna) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        nastavidalje.setOnClickListener {
            val action = PrioritetnaFragmentDirections.actionPrioritetnaFragmentToBolestFragment()
            findNavController().navigate(action)
        }
    }
}