package com.example.lakebeanbrew

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class MenuFragment : Fragment(R.layout.fragment_menu) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val menuOrder =view.findViewById<TextView>(R.id.menu_img_order)

        menuOrder.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_checkoutFragment3)
        }
    }

}