package com.example.trackshelf.data.local.dao

import androidx.room3.Dao
import androidx.room3.Delete
import androidx.room3.Insert
import androidx.room3.OnConflictStrategy
import androidx.room3.Query
import androidx.room3.Update
import com.example.trackshelf.data.local.entity.ProductEntity
import kotlinx.coroutines.flow.Flow


@Dao
interface ProductDao {
    @Query(
        """
        SELECT
        FROM products
        ORDER BY name ASC
    """
    )

    fun getProducts(): Flow<List<ProductEntity>>

    @Query(
        """
        SELECT *
        FROM products
        WHERE name LIKE '%' || :query || '%'
        ORDER by name
    """
    )

    fun searchProducts(query: String): Flow<List<ProductEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProduct(product: ProductEntity): Long

    @Update
    suspend fun updateProduct(product: ProductEntity)

    @Delete
    suspend fun deleteProduct(product: ProductEntity)

    @Query("""
        SELECT *
        FROM products
        WHERE quantity <= minimumStock
        ORDER BY quantity ASC
    """)

    fun getLowStockProducts(): Flow<List<ProductEntity>>

    @Query("""
        SELECT COUNT(*)
        FROM products
    """)

    fun getProductCount(): Flow<Int>

    @Query("""
        SELECT
            SUM(quantity * buyingPrice)
        FROM products
    """)
    fun getInventoryValue(): Flow<Double?>
}