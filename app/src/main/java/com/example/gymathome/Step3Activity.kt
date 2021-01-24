package com.example.gymathome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Step3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step3)
    }

    fun gotoStep4(view: View) {
        val intent = Intent(this, Step4Activity::class.java)

        startActivity(intent)
    }
}