package com.example.trackshelf.feature.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Public
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ProfileScreen(
    viewModel: ProfileViewModel
) {
    val uiState by viewModel.uiState.collectAsState()

    ProfileContent(uiState)
}

@Composable
fun ProfileContent(
    uiState: ProfileUiState
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(20.dp)
    ) {

        // Profile Header
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val initial = uiState.name.firstOrNull()?.uppercaseChar()?.toString() ?: ""

            Box(
                modifier = Modifier
                    .size(110.dp)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.primary),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = initial,
                    style = MaterialTheme.typography.displaySmall,
                    color = MaterialTheme.colorScheme.onPrimary
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = uiState.name,
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = uiState.email,
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }

        Spacer(modifier = Modifier.height(32.dp))

        Text(
            text = "Information",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        ProfileItem(
            icon = Icons.Default.Person,
            title = "About",
            subtitle = uiState.aboutUs
        )

        HorizontalDivider(Modifier, DividerDefaults.Thickness, DividerDefaults.color)

        ProfileItem(
            icon = Icons.Default.Phone,
            title = "Contact",
            subtitle = uiState.contactUs
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Social Media",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        ProfileItem(
            icon = Icons.Default.Public,
            title = uiState.socialFb
        )

        HorizontalDivider(Modifier, DividerDefaults.Thickness, DividerDefaults.color)

        ProfileItem(
            icon = Icons.Default.Public,
            title = uiState.socialIg
        )

        HorizontalDivider(Modifier, DividerDefaults.Thickness, DividerDefaults.color)

        ProfileItem(
            icon = Icons.Default.Public,
            title = uiState.socialTw
        )

        HorizontalDivider(Modifier, DividerDefaults.Thickness, DividerDefaults.color)

        ProfileItem(
            icon = Icons.Default.Public,
            title = uiState.socialYt
        )

        HorizontalDivider(Modifier, DividerDefaults.Thickness, DividerDefaults.color)

        ProfileItem(
            icon = Icons.Default.Public,
            title = uiState.socialLi
        )

        HorizontalDivider(Modifier, DividerDefaults.Thickness, DividerDefaults.color)

        ProfileItem(
            icon = Icons.Default.Public,
            title = uiState.socialWa
        )

        Spacer(modifier = Modifier.height(32.dp))

        Text(
            text = "TrackShelf v1.0.0",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}

    @Composable
    fun ProfileItem(
        icon: androidx.compose.ui.graphics.vector.ImageVector,
        title: String,
        subtitle: String? = null
    ) {

        ListItem(
            modifier = Modifier.clickable { },
            headlineContent = {
                Text(title)
            },
            supportingContent = {
                if (subtitle != null) {
                    Text(subtitle)
                }
            },
            leadingContent = {
                Icon(
                    imageVector = icon,
                    contentDescription = null
                )
            },
            trailingContent = {
                Icon(
                    imageVector = Icons.Default.ChevronRight,
                    contentDescription = null
                )
            }
        )
    }
@Preview(showBackground = true)
@Composable
private fun ProfilePreview() {

    MaterialTheme {

        Surface {

            ProfileContent(
                uiState = ProfileUiState(
                    name = "Danny Vee",
                    email = "danny@trackshelf.com",
                    aboutUs = "TrackShelf helps bookstores manage inventory.",
                    contactUs = "support@trackshelf.com",
                    socialFb = "Facebook",
                    socialIg = "Instagram",
                    socialTw = "Twitter (X)",
                    socialYt = "YouTube",
                    socialLi = "LinkedIn",
                    socialWa = "WhatsApp"
                )
            )
        }
    }
}