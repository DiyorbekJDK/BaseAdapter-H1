package com.example.homework_301022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ListView
import com.example.homework_301022.adapterFood.FoodAdapter
import com.example.homework_301022.model.FoodInfo

class SecondActivity : AppCompatActivity() {
    private val foodDapter by lazy { FoodAdapter(this, listFood()) }
    private lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        listView = findViewById(R.id.listView2)
        listView.adapter = foodDapter

    }

    private fun listFood(): MutableList<FoodInfo> {
        val list = mutableListOf<FoodInfo>()
        list.add(FoodInfo(R.drawable.london, "London", "https://en.wikipedia.org/wiki/London", ""))
        list.add(FoodInfo(R.drawable.rome, "Rome", "https://en.wikipedia.org/wiki/Rome", ""))
        list.add(FoodInfo(R.drawable.paris, "Paris", "https://en.wikipedia.org/wiki/Paris", ""))
        return list
    }
}