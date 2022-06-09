package com.anniljing.jetpacknavigator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anniljing.jetpacknavigator.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}