package com.example.sprint3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.sprint3.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.myCard.setTitle(getString(R.string.titulo_velada))
        binding.myCard.setSubtitle(getString(R.string.subtitulo_velada))
        binding.myCard.setDescription(getString(R.string.toast_implementado))
        binding.myCard.setImageResource(R.drawable.fondo_velada, getString(R.string.velada_ibai))
    }
}
