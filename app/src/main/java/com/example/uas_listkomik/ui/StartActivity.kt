package com.example.uas_listkomik.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.uas_listkomik.MainActivity
import com.example.uas_listkomik.databinding.ActivityStartBinding
import com.example.uas_listkomik.home.HomeFragment

class StartActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener{
        val intent = Intent(this, MainActivity::class.java )
            startActivity(intent)
        }
}}