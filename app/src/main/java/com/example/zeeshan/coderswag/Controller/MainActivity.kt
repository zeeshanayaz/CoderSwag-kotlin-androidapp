package com.example.zeeshan.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.Toast
import com.example.zeeshan.coderswag.Adapters.CategoryAdapter
import com.example.zeeshan.coderswag.Adapters.CategoryRecyclerAdapter
import com.example.zeeshan.coderswag.Model.Category
import com.example.zeeshan.coderswag.R
import com.example.zeeshan.coderswag.R.id.categoryListView
import com.example.zeeshan.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecyclerAdapter(this, DataService.categories)
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)

//        categoryListView.setOnItemClickListener { parent, view, position, id ->
//            val category = DataService.categories[position]
//            Toast.makeText(this, "You clicked on the ${category.title} cell.", Toast.LENGTH_SHORT).show()
//        }
        
    }
}
