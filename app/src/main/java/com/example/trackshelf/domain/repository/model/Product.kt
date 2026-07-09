package com.example.trackshelf.domain.repository.model

data class Product(
    val id: Long = 0,
    val name: String,
    val category: String,
    val buyingPrice: Double,
    val sellingPrice: Double,
    val quantity: Int,
    val minimumStock: Int,
    val barcode: String? = null,
    val notes: String = "",
    val createdAt: Long = System.currentTimeMillis(),
    val updatedAt: Long = System.currentTimeMillis()
)