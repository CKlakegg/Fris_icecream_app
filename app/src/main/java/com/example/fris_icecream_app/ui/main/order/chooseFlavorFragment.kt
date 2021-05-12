package com.example.fris_icecream_app.ui.main.order

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.example.fris_icecream_app.R
import kotlinx.android.synthetic.main.fragment_choose_flavor.*


class chooseFlavorFragment : Fragment() {

    private lateinit var strawberryButton: ImageView
    private lateinit var vanillaButton: ImageView
    private lateinit var chocolateButton: ImageView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_choose_flavor, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        strawberryButton = flavor_strawberry
        vanillaButton = flavor_vanilla
        chocolateButton = flavor_chocolate

        setUpFlavorButton()
    }

    private fun setUpFlavorButton() {


        val options = navOptions {
            anim {
                enter = R.anim.fragment_fade_enter
                exit = R.anim.fragment_fade_exit
                popEnter = R.anim.fragment_fade_enter
                popExit = R.anim.fragment_fade_exit
            }
        }

        flavor_strawberry.setOnClickListener {

            findNavController().navigate(R.id.wantmoreFragment, null, options)
        }

        flavor_vanilla.setOnClickListener {

            findNavController().navigate(R.id.wantmoreFragment, null, options)
        }

        flavor_chocolate.setOnClickListener {

            findNavController().navigate(R.id.wantmoreFragment, null, options)
        }

    }
}