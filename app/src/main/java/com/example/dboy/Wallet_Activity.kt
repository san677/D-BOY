package com.example.dboy

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dboy.WalletRecy.CountryAdapter
import com.example.dboy.WalletRecy.CountryModel

import com.example.dboy.databinding.ActivityWalletBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class Wallet_Activity : AppCompatActivity() {
    lateinit var binding: ActivityWalletBinding
    private lateinit var recyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityWalletBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigation)
        bottomNavigationView.selectedItemId = R.id.bottom_wallet

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.bottom_home -> {
                    startActivity(Intent(applicationContext, MainActivity::class.java))
                    finish()
                    true
                }
                R.id.bottom_new -> {
                    startActivity(Intent(applicationContext, New_order_Activity::class.java))
                    finish()
                    true
                }
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
                R.id.bottom_wallet -> true
                else -> false
            }
        }


        recyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val countryList = ArrayList<CountryModel>()

        countryList.add(CountryModel("Afghanistan",R.drawable.delivered))
        countryList.add(CountryModel("Algeria",R.drawable.delivered))
        countryList.add(CountryModel("Argentina",R.drawable.delivered))
        countryList.add(CountryModel("Australia",R.drawable.delivered))
        countryList.add(CountryModel("Australia",R.drawable.delivered))
        countryList.add(CountryModel("Australia",R.drawable.delivered))
        countryList.add(CountryModel("Australia",R.drawable.delivered))
        countryList.add(CountryModel("Australia",R.drawable.delivered))
        countryList.add(CountryModel("Australia",R.drawable.delivered))
        countryList.add(CountryModel("Australia",R.drawable.delivered))
        countryList.add(CountryModel("Australia",R.drawable.delivered))
        countryList.add(CountryModel("Australia",R.drawable.delivered))
        countryList.add(CountryModel("Australia",R.drawable.delivered))
        countryList.add(CountryModel("Australia",R.drawable.delivered))


        val adapter = CountryAdapter(countryList)

        recyclerView.adapter = adapter

    }
}