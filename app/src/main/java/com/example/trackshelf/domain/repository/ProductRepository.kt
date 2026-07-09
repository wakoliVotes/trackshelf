package com.example.trackshelf.domain.repository

import com.example.trackshelf.domain.repository.model.Product
import kotlinx.coroutines.flow.Flow


interface ProductRepository {
    fun getProducts(): Flow<List<Product>>

    suspend fun getProductById(id: Long): Product?

    fun searchProducts(query: String): Flow<List<Product>>

    suspend fun addProduct(product: Product)

    suspend fun updateProduct(product: Product)

    suspend fun deleteProduct(product: Product)

    fun getLowStockProducts(): Flow<List<Product>>

    fun getProductCount(): Flow<Int>

    fun getInventoryValue(): Flow<Double?>
}