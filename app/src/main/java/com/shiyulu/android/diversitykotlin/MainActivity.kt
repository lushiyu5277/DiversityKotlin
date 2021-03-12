package com.shiyulu.android.diversitykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.shiyulu.android.diversitykotlin.ui.SimpleAdapter

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    private val dataList = arrayOf("A", "B", "C")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view);
        val simpleAdapter = SimpleAdapter(dataList, onClick = {
            s -> Log.e(TAG, "onCreate: $s been clicked")
        })
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = simpleAdapter
    }
}
