package com.example.pilhelloworld

import android.app.Activity
import android.widget.Toast
import com.example.pilhelloworld.databinding.ActivityMainBinding

class MainView(activity: Activity) : ActivityView(activity), MainContract.View {

    private var binding: ActivityMainBinding = ActivityMainBinding.inflate(activity.layoutInflater)

    init {
        activity.setContentView(binding.root)
    }

    override fun showText(onClick: String.Companion) {
        binding.buttonShowText.setOnClickListener { Toast.makeText(activity, getText(), Toast.LENGTH_SHORT).show() }
    }

    override fun getText(): String {
        return binding.insertText.text.toString()
    }
}
