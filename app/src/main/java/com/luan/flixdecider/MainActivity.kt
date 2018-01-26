package com.luan.flixdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val flixList = arrayListOf("Public Enemies", "Star Wars Episode IV", "Fresh Meat", "Dragon Ball")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pickBtn.setOnClickListener {

            val random = Random()
            val randomFlixId = random.nextInt(flixList.count())

            deciderTxt.text = flixList.get(randomFlixId)
        }

        addBtn.setOnClickListener {

            val newFlix = newFlixTxt.text.toString()

            flixList.add(newFlix)

            newFlixTxt.text.clear()

            println(flixList)
        }
    }
}
