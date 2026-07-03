package com.example.trackshelf.feature.settings

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue


@Composable
fun SettingsRoute(
    viewModel: SettingsViewModel = androidx.lifecycle.viewmodel.compose.viewModel()
) {
    val uiState by viewModel.uiState.collectAsState()

    SettingsScreen(
        uiState = uiState,
        onDarkModeChanged = viewModel::onDarkModeChanged,
        onNotificationsChanged = viewModel::onNotificationsChanged,
        onCurrencyChanged = viewModel::onCurrencyChanged
    )
}