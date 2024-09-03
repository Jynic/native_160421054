package com.ivano.project_anmp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Activity_Home : AppCompatActivity(){
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapterHome: AdapterHome
    var epsortlist = ArrayList<EsportObj>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)
        recyclerView = findViewById(R.id.recycle_card)
        initializeEsportList()
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapterHome = AdapterHome(epsortlist)
        recyclerView.adapter = adapterHome
    }
    private fun initializeEsportList() {
        epsortlist.add(EsportObj("League of Legends", "A fast-paced, competitive online game..."))
        epsortlist.add(EsportObj("Dota 2", "A complex, team-based game..."))
        epsortlist.add(EsportObj("Counter-Strike: Global Offensive", "A first-person shooter..."))
        epsortlist.add(EsportObj("Fortnite", "A battle royale game..."))
        epsortlist.add(EsportObj("Valorant", "A tactical first-person shooter..."))
    }
}