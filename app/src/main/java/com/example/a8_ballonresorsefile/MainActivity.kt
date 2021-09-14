package com.example.a8_ballonresorsefile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a8_ballonresorsefile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.Choice.setOnClickListener {
            binding.text.text = random()
        }

    }

    private fun random():String{
        return resources.getStringArray(R.array.results)[randomNumber()]
    }

    private fun randomNumber():Int{
        val sizeArray = resources.getStringArray(R.array.results).size - 1
        return (0..sizeArray).random()
    }




}