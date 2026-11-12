package com.example.lakebeanbrew

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class CheckoutFragment : Fragment(R.layout.fragment_checkout) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val checkoutMenu = view.findViewById<TextView>(R.id.img_order)
        val checkoutHome = view.findViewById<TextView>(R.id.img_home)


        val checkoutName = requireArguments().getString("drinkName")
        val checkoutDescription = requireArguments().get()
        val checkoutPrice = requireArguments().getString("drinkPrice")
        val checkoutImage = requireArguments().getInt("drinkImage")

        val checkoutDrinkName = view.findViewById<TextView>(R.id.checkout_name)
        val checkoutPriceAmount = view.findViewById<TextView>(R.id.total_price)
        val checkoutImageImage =
            view.findViewById<ImageView>(R.id.checkout_img_chocolate_truffle_mocha)


        checkoutDrinkName.setText(checkoutName)
        checkoutPriceAmount.setText(checkoutPrice)
        checkoutImageImage.setImageResource(checkoutImage)






        checkoutMenu.setOnClickListener {
            findNavController().navigate(R.id.menuFragment)
        }

        checkoutHome.setOnClickListener {
            findNavController().navigate(R.id.homeFragment)
        }


    }
}