package com.example.lakebeanbrew

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class CheckoutFragment : Fragment( R.layout.fragment_checkout) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        val checkoutMenu = view.findViewById<TextView>(R.id.img_order)
        val checkoutHome = view.findViewById<TextView>(R.id.img_home)

        checkoutMenu.setOnClickListener {
            findNavController().navigate(R.id.menuFragment)
        }

        checkoutHome.setOnClickListener {
            findNavController().navigate(R.id.homeFragment)
        }


    }
}