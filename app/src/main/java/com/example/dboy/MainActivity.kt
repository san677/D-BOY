package com.example.dboy

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dboy.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityMainBinding.inflate(layoutInflater)
         setContentView(binding.root)

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigation)
        bottomNavigationView.selectedItemId = R.id.bottom_home

         binding.withdrawButton.setOnClickListener {
             val intent=Intent(this,Wallet_Activity::class.java)
             startActivity(intent)
         }

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.bottom_home -> true
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

                R.id.bottom_wallet -> {
                    startActivity(Intent(applicationContext, Wallet_Activity::class.java))
                    finish()
                    true
                }

                else -> false
            }
        }


    }

 }

