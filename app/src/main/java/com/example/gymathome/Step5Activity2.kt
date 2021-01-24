package com.example.gymathome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Step5Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step52)
    }

    fun goToAuth(view: View) {
        val intent = Intent(this, AuthActivity::class.java)
        startActivity(intent)

    }
}