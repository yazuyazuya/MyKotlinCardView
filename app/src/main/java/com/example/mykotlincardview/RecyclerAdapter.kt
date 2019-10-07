package com.example.mykotlincardview

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent

class RecyclerAdapter (private val context: Context,
                       private val itemClickOnListener: RecyclerViewHolder.ItemClickOnListener,
                       private val itemList:List<String>,
                       private val itemList2: List<String>,
                       private val itemList3: List<String>,
                       private val itemList4: List<String>) : RecyclerView.Adapter<RecyclerViewHolder>() {

    private var mRecyclerView : RecyclerView? = null

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        mRecyclerView = recyclerView
    }

    override fun onDetachedFromRecyclerView(recyclerView: RecyclerView) {
        super.onDetachedFromRecyclerView(recyclerView)
        mRecyclerView = null
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {

        val layoutInflater = LayoutInflater.from(context)
        val mView = layoutInflater.inflate(R.layout.list_item, parent, false)

        mView.setOnClickListener { view ->
            mRecyclerView?.let {
                itemClickOnListener.onItemClick(view, it.getChildAdapterPosition(view))
            }
        }

        return RecyclerViewHolder(mView)

    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder?.let {
            it.itemTextView.text = itemList.get(position)
            it.itemTextView2.text = itemList2.get(position)
            it.itemTextView3.text = itemList3.get(position)
            it.itemTextView4.text = itemList4.get(position)
            it.itemImageView.setImageResource(R.mipmap.ic_launcher)
        }
    }

}