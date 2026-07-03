package com.example.trackshelf.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.trackshelf.feature.settings.SettingsRoute

@Composable
fun AppNavigation() {
    val navController = androidx.navigation.compose.rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Dashboard.route
    ) {
        composable(route = Screen.Dashboard.route) {
            DashboardScreen()
        }
        composable(route = Screen.Inventory.route) {
            InventoryScreen()
        }
        composable(route = Screen.Sales.route) {
            SalesScreen()
        }
        composable(route = Screen.Reports.route) {
            ReportsScreen()
        }
        composable(route = Screen.Settings.route) {
            SettingsRoute()
        }
    }
}