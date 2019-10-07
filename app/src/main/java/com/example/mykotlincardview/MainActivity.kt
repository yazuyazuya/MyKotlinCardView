package com.example.mykotlincardview

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), RecyclerViewHolder.ItemClickOnListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val shops = resources.getStringArray(R.array.shops).toMutableList()
        val categories = resources.getStringArray(R.array.categories).toMutableList()
        val count = resources.getStringArray(R.array.count).toMutableList()
        val nextTimes = resources.getStringArray(R.array.nextTimes).toMutableList()

        mainRecyclerView.adapter = RecyclerAdapter(this, this, shops, categories, count, nextTimes)
        mainRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

    }

    override fun onItemClick(view: View, position: Int) {

        val shops = resources.getStringArray(R.array.shops).toMutableList()
        val categories = resources.getStringArray(R.array.categories).toMutableList()
        val count = resources.getStringArray(R.array.count).toMutableList()
        val nextTimes = resources.getStringArray(R.array.nextTimes).toMutableList()

        val intent = Intent(application, Main2Activity::class.java)
        // 今後はここにintent.putExtra()とかでデータを送ったりする？
        intent.putExtra("SHOP_KEY", shops[position])
        intent.putExtra("CATEGORY_KEY", categories[position])
        intent.putExtra("COUNT_KEY", count[position])
        intent.putExtra("NEXT_TIMES_KEY", nextTimes[position])
        startActivity(intent)

    }

}
