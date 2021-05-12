package com.example.fris_icecream_app.ui.main.dropDown


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.example.fris_icecream_app.MainActivity
import com.example.fris_icecream_app.R
import kotlinx.android.synthetic.main.fragment_drop_down.*


class DropDownFragment : Fragment() {

    private lateinit var goToMenu: TextView
    private lateinit var goToOrder: TextView
    private lateinit var goToContact: TextView
    private lateinit var goToNews: TextView
    private lateinit var closeMenu: ImageView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_drop_down, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        goToMenu = menu
        goToOrder = order
        goToContact = contact
        goToNews = news
        closeMenu = close_menu

        setUpButtonsDropDown()
    }

    private fun setUpButtonsDropDown() {


        val options = navOptions {
            anim {
                enter = R.anim.fragment_fade_enter
                exit = R.anim.fragment_fade_exit
                popEnter = R.anim.fragment_fade_enter
                popExit = R.anim.fragment_fade_exit
            }
        }

        goToMenu.setOnClickListener {

            findNavController().navigate(R.id.menuFragment, null, options)




        }

        goToOrder.setOnClickListener {

            findNavController().navigate(R.id.orderFragment, null, options)


        }

        goToContact.setOnClickListener {
            findNavController().navigate(R.id.contactFragment, null, options)

        }

        goToNews.setOnClickListener {
            findNavController().navigate(R.id.newsFragment, null, options)


        }

        closeMenu.setOnClickListener {
            findNavController().navigate(R.id.mainFragment, null, options)


        }


    }
}


