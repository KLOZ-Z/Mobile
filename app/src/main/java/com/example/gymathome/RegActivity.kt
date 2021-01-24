package com.example.gymathome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.gymathome.api.ApiRequest
import com.example.gymathome.api.BASE_URL
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import java.lang.Exception

class RegActivity : AppCompatActivity() {
    
    lateinit var imageView:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)
        imageView = findViewById(R.id.TestView)
    }

    fun backtoauth(view: View) {
        val intent = Intent(this, AuthActivity::class.java)
        startActivity(intent)
    }

    fun register(view: View) {
        makeApiRequest()
    }

    private fun makeApiRequest() {
        val first_nameEdit = findViewById<EditText>(R.id.nameinp)
        val surnameEdit = findViewById<EditText>(R.id.surnameinp)
        val phoneEdit = findViewById<EditText>(R.id.phoneinp)
        val passwordEdit = findViewById<EditText>(R.id.passinp)

        val first_name = first_nameEdit.text.toString()
        val surname = surnameEdit.text.toString()
        val phone = phoneEdit.text.toString()
        val pass = passwordEdit.text.toString()


        val api = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(MoshiConverterFactory.create())
                .build()
                .create(ApiRequest::class.java)

        GlobalScope.launch(Dispatchers.IO) {
            val response = api.startReg(first_name, surname, phone, pass)
            if (response.id.toString()!=""){
                Log.d("MAIN", "sfgesdfghsdhsdgh")
            }
            /*try {
               val response = api.startReg(first_name, surname, phone, pass)
              if( response != ""){
                     Log.e(response)
                   }
               }
               else
                   makeApiRequest()
           }
           catch (e:Exception){
               Log.e("Main", "Error: ${e.message}")
           }
       }*/
        }
    }
}