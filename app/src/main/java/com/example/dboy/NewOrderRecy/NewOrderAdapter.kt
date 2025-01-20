package com.example.dboy.NewOrderRecy

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.dboy.R
import com.example.dboy.WalletRecy.CountryModel

class NewOrderAdapter(private val orderList: ArrayList<OrderModel>) : RecyclerView.Adapter<NewOrderAdapter.ViewHolder>() {


    var OnItemClick:((OrderModel)->Unit)?=null


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_new_order_item,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val order= orderList[position]

//        holder.countryName.text = country.countryName
//        holder.countryImage.setImageResource(country.countryImage)
        holder.itemView.findViewById<Button>(R.id.btnAcceptOrder).setOnClickListener {
           OnItemClick?.invoke(order)
         }
    }

    override fun getItemCount(): Int {
        return orderList.size
    }



    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

//        val countryName = itemView.findViewById<TextView>(R.id.country_name_tv)
//        val countryImage = itemView.findViewById<ImageView>(R.id.country_flag_iv)


    }
}