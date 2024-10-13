package com.example.myproject.api.model

data class Product (
    val id: Int,
    val title:String,
    val price:Int,
    val stock:Int,
    val brand:String,
    val thumbnail:String
)