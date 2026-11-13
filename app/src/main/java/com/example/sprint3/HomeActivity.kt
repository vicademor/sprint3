package com.example.sprint3

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.sprint3.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCombates.setOnClickListener {
            Toast.makeText(
                this,
                getString(R.string.toast_implementado),
                Toast.LENGTH_SHORT
            ).show()
        }

        binding.btnDetalles.setOnClickListener {
            startActivity(Intent(this, DetailActivity::class.java))
        }
    }
}
