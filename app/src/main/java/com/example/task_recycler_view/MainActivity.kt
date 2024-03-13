package com.example.task_recycler_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.task_recycler_view.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapterClass: Adapter_Class   //Create variable of Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        adapterClass=Adapter_Class(List_Data_Initialize.getData(),this) //create object if Adapter
        binding.myRecyclerView.layoutManager=LinearLayoutManager(this)
        binding.myRecyclerView.adapter=adapterClass //attach Adapter with Recycler View
    }
}