package com.example.gymathome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Step1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step1)

    }

    fun goToStep2(view: View) {
        var intent = Intent(this, Step2Activity::class.java)
        startActivity(intent)
    }
}