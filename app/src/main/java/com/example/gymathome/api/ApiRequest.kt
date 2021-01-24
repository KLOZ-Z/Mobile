package com.example.gymathome.api

import com.example.gymathome.models.Auth
import com.example.gymathome.models.Dog
import com.example.gymathome.models.User
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

const val  BASE_URL = "https://it-students.ru/"

interface ApiRequest {
    @FormUrlEncoded
    @POST("signup")
    suspend fun  startReg(@Field("first_name") first_name: String, @Field("surname") surname: String, @Field("phone") phone: String, @Field("password") password: String):Auth
   // suspend fun startReg(@Field("first_name") first_name: String, @Field("surname") surname: String, @Field("phone") phone: String, @Field("password") password: String):User
}