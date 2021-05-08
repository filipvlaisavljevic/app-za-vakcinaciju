package com.example.vakcinacija_stefanfilip

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_sazetak.*


class SazetakFragment : Fragment(R.layout.fragment_sazetak) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sazetakdugme.setOnClickListener {
            val action = SazetakFragmentDirections.actionSazetakFragmentToTerminFragment()
            findNavController().navigate(action)
        }
    }
}