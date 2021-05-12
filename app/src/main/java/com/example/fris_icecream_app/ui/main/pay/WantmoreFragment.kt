package com.example.fris_icecream_app.ui.main.pay

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.example.fris_icecream_app.R
import kotlinx.android.synthetic.main.want_more_fragment.*


class WantmoreFragment : Fragment() {

    private lateinit var wantMoreYesButton: TextView
    private lateinit var wantMoreNoButton: TextView
    private lateinit var backButtonWantMore: ImageButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.want_more_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        wantMoreYesButton = yes_button
        wantMoreNoButton = no_button
        backButtonWantMore = back_button_want_more

        setUpButtonsWantMore()

    }

    private fun setUpButtonsWantMore() {
        val options = navOptions {
            anim {
                enter = R.anim.fragment_fade_enter
                exit = R.anim.fragment_fade_exit
                popEnter = R.anim.fragment_fade_enter
                popExit = R.anim.fragment_fade_exit
            }
        }

        yes_button.setOnClickListener {

            findNavController().navigate(R.id.orderFragment, null, options)

        }

        no_button.setOnClickListener {

            findNavController().navigate(R.id.cheakOutFragment, null, options)


        }

        back_button_want_more.setOnClickListener {

            findNavController().navigate(R.id.chooseFlavorFragment, null, options)

        }
    }

}