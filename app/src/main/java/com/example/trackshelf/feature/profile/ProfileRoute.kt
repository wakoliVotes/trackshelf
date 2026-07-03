package com.example.trackshelf.feature.profile

import androidx.compose.runtime.Composable


@Composable
fun ProfileRoute(
    viewModel: ProfileViewModel,
    onEditProfileClick: () -> Unit,
    onLogoutClick: () -> Unit
) {
    ProfileScreen(
        viewModel = viewModel,
        onEditProfileClick = onEditProfileClick,
        onLogoutClick = onLogoutClick
    )
}
