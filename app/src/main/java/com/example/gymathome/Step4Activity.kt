package com.example.gymathome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Step4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step4)
    }

    fun goToStep5(view: View) {
        val intent = Intent(this, Step5Activity2::class.java)
        startActivity(intent)

    }
}