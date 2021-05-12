package com.example.fris_icecream_app.ui.main.contact

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.example.fris_icecream_app.R
import kotlinx.android.synthetic.main.fragment_contact.*


class ContactFragment : Fragment() {

    private lateinit var backContactButton: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_contact, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        backContactButton = back_button_contact


        setUpBackContactButton()

    }

    private fun setUpBackContactButton(){

        val options = navOptions {
            anim {
                enter = R.anim.fragment_fade_enter
                exit = R.anim.fragment_fade_exit
                popEnter = R.anim.fragment_fade_enter
                popExit = R.anim.fragment_fade_exit
            }
        }


        back_button_contact.setOnClickListener {

            findNavController().navigate(R.id.dropDownFragment, null, options)
        }
    }

}