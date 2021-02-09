package com.percobaan.tugasch5intentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.percobaan.tugasch5intentapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
        binding.btn2.setOnClickListener {
            val intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "I can share this to Social Media")
                type = "text/plain"
            }
            startActivity(Intent.createChooser(intent, "Share to : "));
            }
        }
    }

