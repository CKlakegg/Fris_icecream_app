package com.example.fris_icecream_app.ui.main.order

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.example.fris_icecream_app.R
import kotlinx.android.synthetic.main.order_fragment.*

class OrderFragment : Fragment() {

    private lateinit var oderIceButton : ImageView
    private lateinit var oderShakes : ImageView
    private lateinit var oderCoffe : ImageView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.order_fragment, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        oderIceButton = ice_cream_order
        oderShakes = shakes_order
        oderCoffe = coffe_order

        setUpOderButton()


    }

    private fun setUpOderButton(){

        val options = navOptions {
            anim {
                enter = R.anim.fragment_fade_enter
                exit = R.anim.fragment_fade_exit
                popEnter = R.anim.fragment_fade_enter
                popExit = R.anim.fragment_fade_exit
            }
        }


        ice_cream_order.setOnClickListener {

            findNavController().navigate(R.id.chooseFlavorFragment, null, options)

        }

        shakes_order.setOnClickListener {

            findNavController().navigate(R.id.chooseFlavorFragment, null, options)
        }

        coffe_order.setOnClickListener {

            findNavController().navigate(R.id.chooseCoffeFragment, null, options)
        }
    }


}