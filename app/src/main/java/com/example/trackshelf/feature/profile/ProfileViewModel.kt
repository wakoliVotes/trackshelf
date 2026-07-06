package com.example.trackshelf.feature.profile

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
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

data class ProfileUiState (
    val name: String = "John Doe",
    val email: String = "trackshelf@company.com",
    val profilePictureUrl: String = "https://trackshelf.com/profile.jpg",

    val aboutUs: String = "About Us",
    val contactUs: String = "Contact Us",

    val socialFb: String = "Facebook",
    val socialIg: String = "Instagram",
    val socialTw: String = "Twitter",
    val socialYt: String = "YouTube",
    val socialLi: String = "LinkedIn",
    val socialWa: String = "WhatsApp",

    val darkMode: Boolean = false,
    val notifications: Boolean = true,
    val currency: String = "KSH"
)


@Preview
@Composable
fun ProfileContentPreview() {
    ProfileContent(
        uiState = ProfileUiState(
            name = "John Doe",
            email = "trackshelf@company.com",
            profilePictureUrl = "https://trackshelf.com/profile.jpg",
            aboutUs = "About Us",
            contactUs = "Contact Us",
            socialFb = "Facebook",
            socialIg = "Instagram",
            socialTw = "Twitter",
            socialYt = "YouTube",
            socialLi = "LinkedIn",
            socialWa = "WhatsApp",
            darkMode = false,
            notifications = true,
            currency = "KSH"
        )
    )
}