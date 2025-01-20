package com.example.dboy.WalletRecy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dboy.R

class CountryAdapter(private val countryList : ArrayList<CountryModel>) : RecyclerView.Adapter<CountryAdapter.ViewHolder>() {

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

//        val countryName = itemView.findViewById<TextView>(R.id.country_name_tv)
//        val countryImage = itemView.findViewById<ImageView>(R.id.country_flag_iv)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_country,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val country = countryList[position]

//        holder.countryName.text = country.countryName
//        holder.countryImage.setImageResource(country.countryImage)
    }

    override fun getItemCount(): Int {
        return countryList.size
    }
}