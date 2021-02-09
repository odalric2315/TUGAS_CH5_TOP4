package com.percobaan.tugasch5intentapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.trimmedLength
import com.google.android.material.snackbar.Snackbar
import com.percobaan.tugasch5intentapp.databinding.ActivitySecondBinding

@Suppress("NAME_SHADOWING")
class SecondActivity: AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnlogin.setOnClickListener {
            val name = binding.etname.text.toString().trim()
            Toast.makeText(this, "Welcome $name", Toast.LENGTH_LONG).show()
//            binding.btnlogin.setOnClickListener {
//                val name = binding.etname.text.toString().trim()
                Intent(this, ThirdActivity::class.java).apply {
                    //bundle
                    val bundle = Bundle()
                    bundle.putString("name", name)
                    bundle.putInt("age", 28)

                    //serializable
                    val person = Person(name, "$name@gmail.com", )
                    putExtra("person", person)

                    //Parcelable
                    val people = People(name, "bebas")
                    putExtra("people", people)
                    startActivity(this)
                }
            }
        }
    }
