package com.shiyulu.android.diversitykotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.shiyulu.android.diversitykotlin.activities.EncryptionActivity
import com.shiyulu.android.diversitykotlin.ui.SimpleAdapter
import com.shiyulu.android.diversitykotlin.utils.*

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    private val dataList = arrayOf("A", "B", "C")
    private val activityList = arrayOf(EncryptionActivity::class)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view);
        val simpleAdapter = SimpleAdapter(dataList, onClick = {
            s -> Log.e(TAG, "onCreate: $s been clicked, time is " + now())
            if (s < activityList.size) {
                val jumpIntent = Intent(applicationContext, activityList[s].java)
                startActivity(jumpIntent)
            }
        })
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = simpleAdapter
    }
}
