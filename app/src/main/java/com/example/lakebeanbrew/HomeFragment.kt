package com.example.lakebeanbrew

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val order = view.findViewById<TextView>(R.id.img_order)



        order.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_menuFragment)
        }
    }


}