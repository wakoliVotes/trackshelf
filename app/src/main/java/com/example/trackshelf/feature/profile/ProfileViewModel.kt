package com.example.trackshelf.feature.profile

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow


class ProfileViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(ProfileUiState())
    val uiState: StateFlow<ProfileUiState> = _uiState.asStateFlow()

    fun onEditProfileClick() {
        // Handle edit profile click
    }

    fun onLogoutClick() {
        // Handle logout click
    }
}

annotation class ProfileUiState (
    val name: String = "John Doe",
    val email: String = "john.doe@example.com",
    val profilePictureUrl: String = "https://example.com/profile.jpg",
)
