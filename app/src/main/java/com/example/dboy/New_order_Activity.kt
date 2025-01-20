package com.example.dboy

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dboy.NewOrderRecy.NewOrderAdapter
import com.example.dboy.NewOrderRecy.OrderModel
import com.example.dboy.NewOrderRecy.Order_Navigation_Activity
import com.example.dboy.WalletRecy.CountryModel
import com.example.dboy.databinding.ActivityNewOrderBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class New_order_Activity : AppCompatActivity() {
    lateinit var binding: ActivityNewOrderBinding
    private lateinit var recyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityNewOrderBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigation)
        bottomNavigationView.selectedItemId = R.id.bottom_new

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.bottom_home -> {
                    startActivity(Intent(applicationContext, MainActivity::class.java))
                     finish()
                    true
                }
                R.id.bottom_new -> true
                R.id.bottom_ongo -> {
                    startActivity(Intent(applicationContext, OnGoiong_Activity::class.java))
                     finish()
                    true
                }
                R.id.bottom_deliver -> {
                    startActivity(Intent(applicationContext, Delivered_Activity::class.java))
                     finish()
                    true
                }
                R.id.bottom_wallet -> {
                    startActivity(Intent(applicationContext, Wallet_Activity::class.java))
                    finish()
                    true
                }
                else -> false
            }
        }



        recyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val orderList = ArrayList<OrderModel>()

        orderList.add(OrderModel("hiii",R.drawable.delivered))
        orderList.add(OrderModel("hiii",R.drawable.delivered))
        orderList.add(OrderModel("hiii",R.drawable.delivered))
        orderList.add(OrderModel("hiii",R.drawable.delivered))
        orderList.add(OrderModel("hiii",R.drawable.delivered))
        orderList.add(OrderModel("hiii",R.drawable.delivered))
        orderList.add(OrderModel("hiii",R.drawable.delivered))
        orderList.add(OrderModel("hiii",R.drawable.delivered))
        orderList.add(OrderModel("hiii",R.drawable.delivered))
        orderList.add(OrderModel("hiii",R.drawable.delivered))
        orderList.add(OrderModel("hiii",R.drawable.delivered))
        orderList.add(OrderModel("hiii",R.drawable.delivered))
        orderList.add(OrderModel("hiii",R.drawable.delivered))
        orderList.add(OrderModel("hiii",R.drawable.delivered))


        val adapter = NewOrderAdapter(orderList)

        recyclerView.adapter = adapter

        adapter.OnItemClick={
            val intent=Intent(this,Order_Navigation_Activity::class.java)
            startActivity(intent)
        }

    }
}