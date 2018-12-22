package com.nandaadisaputra.master.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.nandaadisaputra.master.recyclerview.adapter.AdapterBio
import com.nandaadisaputra.master.recyclerview.model.Models
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // set variable global
    companion object {
        private var models :MutableList<Models> = mutableListOf()
        var adapter : AdapterBio? = null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupAdapter()
    }

    fun setupAdapter(){
        for (i in 1..8){
            models.add(Models("Nanda Adisaputra", "Android developer"))
        }

        adapter = AdapterBio(this, models)

        rv_lists.layoutManager = LinearLayoutManager(this)
        rv_lists.adapter = adapter
    }
}
