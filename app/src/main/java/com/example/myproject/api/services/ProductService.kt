package com.example.myproject.api.services

import com.example.myproject.api.model.ProductResponse
import retrofit2.Call
import retrofit2.http.GET

interface ProductService {
    @GET("products")
    fun getALl(): Call<ProductResponse>
}