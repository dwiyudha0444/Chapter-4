package com.dwiyu.chapter_4_viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.dwiyu.chapter_4_viewmodel.databinding.ActivityUsingViewModelBinding

class UsingViewModel : AppCompatActivity() {

    lateinit var viewModel : HitungViewModel

    lateinit var binding: ActivityUsingViewModelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUsingViewModelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(HitungViewModel::class.java)
        binding. txtHasil.text = viewModel.hasil.toString()
//        displayResult()

        binding.btnHitung.setOnClickListener{
            var pj = binding.etPanjang.text.toString().toInt()
            var lb = binding.etLebar.text.toString().toInt()
            var tg = binding.etTinggi.text.toString().toInt()
            viewModel.Hitung(pj,lb,tg)
            binding.txtHasil.text = viewModel.hasil.toString()
        }
    }

}