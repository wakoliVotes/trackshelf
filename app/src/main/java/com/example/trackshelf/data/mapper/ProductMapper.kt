package com.example.trackshelf.data.mapper

import com.example.trackshelf.data.local.entity.ProductEntity
import com.example.trackshelf.domain.repository.model.Product


fun ProductEntity.toDomain() = Product(
    id = id,
    name = name,
    category = category,
    buyingPrice = buyingPrice,
    sellingPrice = sellingPrice,
    quantity = quantity,
    minimumStock = minimumStock,
    barcode = barcode,
    notes = notes,
    createdAt = createdAt,
    updatedAt = updatedAt
)