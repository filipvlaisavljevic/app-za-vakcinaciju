package com.example.vakcinacija_stefanfilip

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_bolest.*


class BolestFragment : Fragment(R.layout.fragment_bolest) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bolovanje_submit.setOnClickListener {
            val action = BolestFragmentDirections.actionBolestFragmentToVakcinaFragment()
            findNavController().navigate(action)
        }
    }
}