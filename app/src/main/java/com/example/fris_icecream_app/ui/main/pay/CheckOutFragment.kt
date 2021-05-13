package com.example.fris_icecream_app.ui.main.pay

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import androidx.recyclerview.widget.RecyclerView
import com.example.fris_icecream_app.R
import kotlinx.android.synthetic.main.fragment_check_out.*
import kotlinx.android.synthetic.main.fragment_check_out.view.*


class CheckOutFragment : Fragment() {

    private lateinit var addOneMore: Button
    private lateinit var payButton: Button
    private lateinit var goBackButton: ImageButton
    private lateinit var recyclerView: RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_check_out, container, false)

        recyclerView = view.order_recyclerView

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        addOneMore = add_more_button
        payButton = pay_button
        goBackButton = back_button_checkout
        recyclerView = order_recyclerView

        setUpCheckOutButtons()
        initRecyclerView()

    }

    private fun setUpCheckOutButtons() {

        val options = navOptions {
            anim {
                enter = R.anim.fragment_fade_enter
                exit = R.anim.fragment_fade_exit
                popEnter = R.anim.fragment_fade_enter
                popExit = R.anim.fragment_fade_exit
            }
        }

        add_more_button.setOnClickListener {
        }

        pay_button.setOnClickListener {
            findNavController().navigate(R.id.cheakOutFragment, null, options)
        }

        back_button_checkout.setOnClickListener {
            findNavController().navigate(R.id.wantmoreFragment, null, options)
        }
    }

    private fun initRecyclerView(){


    }
}