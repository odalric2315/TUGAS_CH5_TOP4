package com.percobaan.tugasch5intentapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.percobaan.tugasch5intentapp.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent = intent
        //get bundle
        val bundle = intent.getBundleExtra("bundle")

        //get serializable
        val person = intent.getSerializableExtra("person") as Person
        binding.tv2.text = "${person.name} ${person.email}"

        //get parcelable
        val people = intent.getParcelableExtra<People>("people")
//        binding.tv2.text = "${people?.name} ${people?.password}"

        Snackbar.make(binding.root, "Login is Successful", Snackbar.LENGTH_LONG).setAction("Cancel") {
        }.show()
        }
    }