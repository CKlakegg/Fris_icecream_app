package com.example.fris_icecream_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.fris_icecream_app.ui.main.dropDown.DropDownFragment
import com.example.fris_icecream_app.ui.main.menu.MenuFragment
import kotlinx.android.synthetic.main.main_activity.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)


    }

}