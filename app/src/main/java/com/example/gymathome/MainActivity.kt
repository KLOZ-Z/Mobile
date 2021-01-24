package com.example.gymathome

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity


 class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val handler = Handler()
        handler.postDelayed({start()}, 4000)
    }

    private fun start(){
        // var intent = Intent(this, Step1Activity::class.java)
        // startActivity(intent)
         val MY_SETTINGS: String = "my_settings";
            val sp = getSharedPreferences(MY_SETTINGS, Context.MODE_PRIVATE)
            val HasVisited = sp.getBoolean("hasVisited", false)
            if(!HasVisited){
                 var intent = Intent(this, Step1Activity::class.java)
                 startActivity(intent)
            val e = sp.edit()
            e.putBoolean("hasVisited", true)
            e.apply()
            }
            else{
                 var intent = Intent(this, AuthActivity::class.java)
                startActivity(intent)
            }
    }
}