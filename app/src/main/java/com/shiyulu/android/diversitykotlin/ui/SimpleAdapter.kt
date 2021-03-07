package com.shiyulu.android.diversitykotlin.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.shiyulu.android.diversitykotlin.R

class SimpleAdapter(private val dataList: Array<String>, private val onClick: (String) -> Unit) : RecyclerView.Adapter<SimpleAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_simple_adapter, parent, false)
        return ViewHolder(view, onClick)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = dataList[position]
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    inner class ViewHolder(view: View, onClick:(String)->Unit) : RecyclerView.ViewHolder(view) {
        val textView: TextView
        init {
            textView = view.findViewById(R.id.text_view)
            view.setOnClickListener(View.OnClickListener {
                onClick(dataList[position])
            })
        }
    }

}