package com.example.trackshelf.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.trackshelf.feature.dashboard.DashboardScreen
import com.example.trackshelf.feature.inventory.InventoryScreen
import com.example.trackshelf.feature.onboarding.OnboardingScreen
import com.example.trackshelf.feature.profile.ProfileScreen
import com.example.trackshelf.feature.reports.ReportsScreen
import com.example.trackshelf.feature.sales.SalesScreen
import com.example.trackshelf.feature.settings.SettingsRoute

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Onboarding.route
    ) {
        composable(route = Screen.Onboarding.route) {
            OnboardingScreen(
                onFinishOnboarding = {
                    navController.navigate(Screen.Dashboard.route) {
                        popUpTo(Screen.Onboarding.route) { inclusive = true }
                    }
                }
            )
        }

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
        composable(route = Screen.Profile.route) {
            ProfileScreen(
                viewModel = viewModel()
            )
        }
    }
}