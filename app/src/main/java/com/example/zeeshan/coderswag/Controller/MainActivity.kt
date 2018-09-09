package com.example.zeeshan.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.zeeshan.coderswag.Adapters.CategoryAdapter
import com.example.zeeshan.coderswag.Model.Category
import com.example.zeeshan.coderswag.R
import com.example.zeeshan.coderswag.R.id.categoryListView
import com.example.zeeshan.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)
        categoryListView.adapter = adapter
    }


}
