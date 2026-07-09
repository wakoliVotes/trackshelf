package com.example.trackshelf.data.repository

import com.example.trackshelf.data.local.dao.ProductDao
import com.example.trackshelf.domain.repository.ProductRepository
import com.example.trackshelf.domain.repository.model.Product
import java.util.concurrent.Flow
import javax.inject.Inject


class ProductRepositoryImpl @Inject constructor(
    private val productDao: ProductDao
) : ProductRepository {
    override fun getProducts(): kotlinx.coroutines.flow.Flow<List<Product>> {
        TODO("Not yet implemented")
    }

    override suspend fun getProductById(id: Long): Product? {
        TODO("Not yet implemented")
    }

    override fun searchProducts(query: String): kotlinx.coroutines.flow.Flow<List<Product>> {
        TODO("Not yet implemented")
    }

    override suspend fun addProduct(product: Product) {
        TODO("Not yet implemented")
    }

    override suspend fun updateProduct(product: Product) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteProduct(product: Product) {
        TODO("Not yet implemented")
    }

    override fun getLowStockProducts(): kotlinx.coroutines.flow.Flow<List<Product>> {
        TODO("Not yet implemented")
    }

    override fun getProductCount(): kotlinx.coroutines.flow.Flow<Int> {
        TODO("Not yet implemented")
    }

    override fun getInventoryValue(): kotlinx.coroutines.flow.Flow<Double?> {
        TODO("Not yet implemented")
    }

}