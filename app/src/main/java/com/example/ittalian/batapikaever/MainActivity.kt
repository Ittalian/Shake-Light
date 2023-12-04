package com.example.ittalian.batapikaever

import android.content.Intent
import android.hardware.camera2.CameraManager.TorchCallback
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ittalian.batapikaever.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.startBtn.setOnClickListener {
            val intent = Intent(this, TorchOnService::class.java)
            binding.situationText.text = getString(R.string.startBtn_pushed_text)
            startService(intent)
        }

        binding.stopBtn.setOnClickListener {
            val intent = Intent(this, TorchOnService::class.java)
            binding.situationText.text = getString(R.string.stopBtn_pushed_text)
            stopService(intent)
        }
    }
}