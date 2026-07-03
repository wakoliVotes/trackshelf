package com.example.trackshelf.navigation

sealed class Screen(val route: String) {
    object Dashboard : Screen("dashboard")
    object Inventory : Screen("inventory")
    object Sales : Screen("sales")
    object Reports : Screen("reports")
    object Settings : Screen("settings")
}