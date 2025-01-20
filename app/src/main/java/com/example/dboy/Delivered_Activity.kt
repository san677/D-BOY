package com.example.dboy

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class Delivered_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_delivered)

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigation)
        bottomNavigationView.selectedItemId = R.id.bottom_deliver

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
                R.id.bottom_deliver -> true
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