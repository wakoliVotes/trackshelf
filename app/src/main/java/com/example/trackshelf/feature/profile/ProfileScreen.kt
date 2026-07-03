package com.example.trackshelf.feature.profile

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue


@Composable
fun ProfileScreen(
    viewModel: ProfileViewModel,
    onEditProfileClick: () -> Unit,
    onLogoutClick: () -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()

    ProfileContent(
        uiState = uiState,
        onEditProfileClick = onEditProfileClick,
        onLogoutClick = onLogoutClick
    )

}

@Composable
fun ProfileContent(
    uiState: ProfileUiState,
    onEditProfileClick: () -> Unit,
    onLogoutClick: () -> Unit
) {
    TODO("Not yet implemented")

}


