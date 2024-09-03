package com.ivano.project_anmp

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Adapter untuk RecyclerView
class AdapterHome(private val itemList: List<EsportObj>) : RecyclerView.Adapter<AdapterHome.ViewHolder>() {

    // ViewHolder untuk memegang referensi tampilan
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameTextView: TextView = view.findViewById(R.id.judulCard)
        val descriptionTextView: TextView = view.findViewById(R.id.subtitleCard)
    }

    // Membuat ViewHolder baru
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.home_card_item, parent, false)
        return ViewHolder(view)
    }

    // Mengikat data ke ViewHolder
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val esportGame = itemList[position]
        Log.d("Activity_Home", esportGame.name)
        holder.nameTextView.text = esportGame.name
        holder.descriptionTextView.text = esportGame.description
    }

    // Mengembalikan jumlah item dalam data
    override fun getItemCount(): Int {
        return itemList.size
    }
}
