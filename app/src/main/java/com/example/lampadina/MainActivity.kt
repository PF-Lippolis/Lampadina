package com.example.lampadina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import com.example.lampadina.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSwitchListener()
    }

    private fun setSwitchListener() {
        binding.lightSwitch.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked) {
                binding.imageOn.visibility = View.VISIBLE
                binding.imageOff.visibility = View.INVISIBLE
            } else {
                binding.imageOn.visibility = View.INVISIBLE
                binding.imageOff.visibility = View.VISIBLE
            }
        }
    }
}