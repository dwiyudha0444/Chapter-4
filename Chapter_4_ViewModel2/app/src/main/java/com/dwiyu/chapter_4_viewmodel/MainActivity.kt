package com.dwiyu.chapter_4_viewmodel

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.dwiyu.chapter_4_viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var btnVM : Button
    lateinit var btnWVM : Button
    lateinit var btnStudent : Button
    lateinit var btnUser : Button

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnUsingVM.setOnClickListener{
            startActivity(Intent(this, UsingViewModel::class.java))
        }

    }
}