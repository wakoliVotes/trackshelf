package com.example.trackshelf.feature.settings

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Switch
import androidx.compose.material3.Text

@Composable
fun SettingsScreen(
    uiState: SettingsUiState,
    onDarkModeChanged: (Boolean) -> Unit,
    onNotificationsChanged: (Boolean) -> Unit,
    onCurrencyChanged: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val currencies = listOf("KES", "USD", "EUR")

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        Text(
            text = "Settings",
            style = MaterialTheme.typography.headlineMedium
        )

        // Dark Mode
        Card(
            modifier = Modifier.fillMaxWidth()
        ) {
            SettingSwitchItem(
                title = "Dark Mode",
                checked = uiState.darkMode,
                onCheckedChange = onDarkModeChanged
            )
        }

        // Notifications
        Card(
            modifier = Modifier.fillMaxWidth()
        ) {
            SettingSwitchItem(
                title = "Notifications",
                checked = uiState.notifications,
                onCheckedChange = onNotificationsChanged
            )
        }

        // Currency
        Card(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = "Currency",
                    style = MaterialTheme.typography.titleMedium
                )

                Spacer(modifier = Modifier.height(8.dp))

                currencies.forEach { currency ->
                    RowRadioItem(
                        text = currency,
                        selected = uiState.currency == currency,
                        onClick = { onCurrencyChanged(currency) }
                    )
                }
            }
        }
    }
}

@Composable
private fun SettingSwitchItem(
    title: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit
) {
    androidx.compose.foundation.layout.Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.bodyLarge
        )

        Switch(
            checked = checked,
            onCheckedChange = onCheckedChange
        )
    }
}

@Composable
private fun RowRadioItem(
    text: String,
    selected: Boolean,
    onClick: () -> Unit
) {
    androidx.compose.foundation.layout.Row(
        modifier = Modifier
            .fillMaxWidth()
            .selectable(
                selected = selected,
                onClick = onClick
            )
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        RadioButton(
            selected = selected,
            onClick = onClick
        )

        Text(
            text = text,
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}