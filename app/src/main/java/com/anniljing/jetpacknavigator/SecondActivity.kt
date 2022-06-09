package com.anniljing.jetpacknavigator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.ActivityNavigator
import androidx.navigation.Navigation
import com.anniljing.jetpacknavigator.databinding.ActivitySecondBinding
import java.lang.StringBuilder

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val from: String = intent.getStringExtra("from").toString()
        val extra: Int = intent.getIntExtra("extra", 0)
        val build = StringBuilder()
        build.append(from).append("====").append(extra)
        binding.secondActivity.text = build.toString()
    }

    override fun finish() {
        super.finish()
        ActivityNavigator.applyPopAnimationsToPendingTransition(this)
    }
}