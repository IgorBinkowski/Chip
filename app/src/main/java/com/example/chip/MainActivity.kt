package com.example.chip

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.chip.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupChip()
    }

    private fun setupChip() {
        binding.chip1.setOnClickListener {
            Toast.makeText(this, "Clicked on `Add Item` chip", Toast.LENGTH_SHORT).show()
        }
        binding.chip2.setOnClickListener {
            Toast.makeText(this, "Clicked on `Edit Item` chip", Toast.LENGTH_SHORT).show()
        }
        binding.chip3.setOnClickListener {
            Toast.makeText(this, "Clicked on `Delete Item` chip", Toast.LENGTH_SHORT).show()
        }
    }
}
