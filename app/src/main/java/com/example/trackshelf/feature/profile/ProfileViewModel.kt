package com.example.trackshelf.feature.profile

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow


class ProfileViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(ProfileUiState())
    val uiState: StateFlow<ProfileUiState> = _uiState.asStateFlow()

    fun onDarkModeChanged(darkMode: Boolean) {
        _uiState.value = _uiState.value.copy(darkMode = darkMode)
    }

    fun onNotificationsChanged(notifications: Boolean) {
        _uiState.value = _uiState.value.copy(notifications = notifications)
    }

    fun onCurrencyChanged(currency: String) {
        _uiState.value = _uiState.value.copy(currency = currency)
    }

    fun onProfilePictureChanged(profilePictureUrl: String) {
        _uiState.value = _uiState.value.copy(profilePictureUrl = profilePictureUrl)
    }

    fun onNameChanged(name: String) {
        _uiState.value = _uiState.value.copy(name = name)
    }

    fun onEmailChanged(email: String) {
        _uiState.value = _uiState.value.copy(email = email)
    }


}

annotation class ProfileUiState (
    val name: String = "John Doe",
    val email: String = "john.doe@example.com",
    val profilePictureUrl: String = "https://example.com/profile.jpg",
    val aboutUs: String = "About Us",
    val contactUs: String = "Contact Us",
    val social_fb: String = "Facebook",
    val social_ig: String = "Instagram",
    val social_tw: String = "Twitter",
    val social_yt: String = "YouTube",
    val social_li: String = "LinkedIn",
    val social_wa: String = "WhatsApp"
)
