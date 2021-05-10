package com.example.fris_icecream_app.ui.main.dropDown



import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
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


        goToMenu.setOnClickListener {


                Toast.makeText(context, "Somethins went wrong!", Toast.LENGTH_LONG).show()

        }

        goToOrder.setOnClickListener {

        }

        goToContact.setOnClickListener {

        }

        goToNews.setOnClickListener {


        }

        closeMenu.setOnClickListener {

            (activity as MainActivity).onBackPressed()

        }


    }
}
