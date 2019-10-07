package com.example.mykotlincardview

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class RecyclerViewHolder(view: View): RecyclerView.ViewHolder(view) {

    interface ItemClickOnListener {
        fun onItemClick(view: View, position: Int)
    }

    val itemTextView : TextView = view.findViewById(R.id.itemTextView)
    val itemTextView2 : TextView = view.findViewById(R.id.itemTextView2)
    val itemTextView3 : TextView = view.findViewById(R.id.itemTextView3)
    val itemTextView4 : TextView = view.findViewById(R.id.itemTextView4)
    val itemImageView : ImageView = view.findViewById(R.id.itemImageView)

    init {

    }

}