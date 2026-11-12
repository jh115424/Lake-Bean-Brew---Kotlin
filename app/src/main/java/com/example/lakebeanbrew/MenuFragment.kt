package com.example.lakebeanbrew

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class MenuFragment : Fragment(R.layout.fragment_menu) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val menuOrder = view.findViewById<TextView>(R.id.menu_img_order)

        menuOrder.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_checkoutFragment3)
        }


        val menuHome = view.findViewById<TextView>(R.id.img_home)

        menuHome.setOnClickListener {
            findNavController().navigate(R.id.homeFragment)
        }


        val drinkBrownSugar = view.findViewById<TextView>(R.id.menu_arrow)
        val drinkCaramel = view.findViewById<TextView>(R.id.menu_arrow_2)
        val drinkChocTruffle = view.findViewById<TextView>(R.id.menu_arrow_3)
        val drinkVanillaFrappe = view.findViewById<TextView>(R.id.menu_arrow_4)


        drinkBrownSugar.setOnClickListener {
            val bundle = bundleOf(
                "drinkName" to "Brown Sugar Brew",
                "drinkDescription" to "Smooth cold brew with sweet brown sugar",
                "drinkPrice" to "5.75",
                "drinkImage" to R.drawable.brown_sugar_brew

            )

            findNavController().navigate(R.id.action_menuFragment_to_checkoutFragment3, bundle)

        }

        drinkCaramel.setOnClickListener {

            val bundle = bundleOf(
                "drinkName" to "Caramel Frappuccino",
                "drinkDescription" to "Sweet coffee, bold coffee, pure bliss...",
                "drinkPrice" to "6.75",
                "drinkImage" to R.drawable.caramel_frappuccino
            )
            findNavController().navigate(R.id.action_menuFragment_to_checkoutFragment3, bundle)
        }
        drinkChocTruffle.setOnClickListener {
            val bundle = bundleOf(
                "drinkName" to "Chocolate Truffle Mocha",
                "drinkDescription" to "Rich chocolate, velvety mocha, pure indulgence",
                "drinkPrice" to "7.25",
                "drinkImage" to R.drawable.chocolate_truffle_mocha
            )
            findNavController().navigate(R.id.action_menuFragment_to_checkoutFragment3, bundle)
        }

        drinkVanillaFrappe.setOnClickListener {
            val bundle = bundleOf(
                "drinkName" to "Iced Vanilla Frappuccino",
                "drinkDescription" to "Creamy real vanilla, frosty bliss in every sip",
                "drinkPrice" to "6.50",
                "drinkImage" to R.drawable.iced_vanilla_frappuccino
            )
            findNavController().navigate(R.id.action_menuFragment_to_checkoutFragment3, bundle)
        }


    }

}