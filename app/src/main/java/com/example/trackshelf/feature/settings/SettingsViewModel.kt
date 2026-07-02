package com.example.inkventory.feature.settings

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SettingsViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(SettingsUiState())

    val uiState: StateFlow<SettingsUiState> = _uiState.asStateFlow()

    fun onDarkModeChanged(enabled: Boolean) {
        _uiState.update {
            it.copy(darkMode = enabled)
        }
    }

    fun onNotificationsChanged(enabled: Boolean) {
        _uiState.update {
            it.copy(notifications = enabled)
        }
    }

    fun onCurrencyChanged(currency: String) {
        _uiState.update {
            it.copy(currency = currency)
        }
    }
}

data class SettingsUiState(
    val darkMode: Boolean = false,
    val notifications: Boolean = true,
    val currency: String = "KES"
)