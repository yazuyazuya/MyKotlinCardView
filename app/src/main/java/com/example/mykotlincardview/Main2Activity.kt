package com.example.mykotlincardview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        textView.text = intent.getStringExtra("SHOP_KEY")
        textView2.text = intent.getStringExtra("CATEGORY_KEY")
        textView3.text = intent.getStringExtra("COUNT_KEY")
        textView4.text = intent.getStringExtra("NEXT_TIMES_KEY")

    }

}
