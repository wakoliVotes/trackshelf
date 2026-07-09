package com.example.trackshelf.domain.validation

import com.example.trackshelf.domain.repository.model.Product

class ProductValidator {
    fun validate(product: Product): ValidationResult {

        if(product.name.isBlank()) {
            return ValidationResult.Error("Product name cannot be empty.")
        }

        if(product.category.isBlank()) {
            return ValidationResult.Error("Product category cannot be empty.")
        }
        if(product.buyingPrice <= 0) {
            return ValidationResult.Error("Buying price must be a positive number.")
        }
        if(product.sellingPrice <= 0) {
            return ValidationResult.Error("Selling price must be a positive number.")
        }
        if(product.quantity < 0) {
            return ValidationResult.Error("Quantity must be a non-negative number.")
        }
        if(product.minimumStock < 0) {
            return ValidationResult.Error("Minimum stock must be a non-negative number.")
        }
        if(product.barcode.isNullOrBlank()) {
            return ValidationResult.Error("Barcode cannot be empty.")
        }
        return ValidationResult.Success
    }
}

sealed interface ValidationResult {
    data object Success: ValidationResult

    data class Error(
        val message: String
    ) : ValidationResult
}