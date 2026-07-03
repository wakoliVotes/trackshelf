package com.example.trackshelf.navigation

sealed class Screen(val route: String) {

    object Onboarding : Screen("onboarding")
    object Dashboard : Screen("dashboard")
    object Inventory : Screen("inventory")
    object Sales : Screen("sales")
    object Reports : Screen("reports")
    object Settings : Screen("settings")
    object Profile : Screen("profile")
}