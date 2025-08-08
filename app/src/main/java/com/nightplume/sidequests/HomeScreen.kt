package com.nightplume.sidequests

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

/*
* This screen will show the following:
* -Profile (profile picture, profile level, and guild banner)
* -Wallet with currencies
* -Notifications
* -Quest Log (shows active main/side quests with a timer of the quests closest to becoming active)
* -Upcoming events (shows upcoming events that arent on the quest list. Could be legendary events)
* -Party member window (has an active list of the members horizontally with pictures and the 'add' feature)
* -Bottom widgets (social, map, home/settings, messages, trading post)
*/
@Composable
fun HomeScreen (navController: NavController) {

    Column {

        //text properties
        Text(
            "Home Screen"
        )

        Spacer(modifier = Modifier.height(10.dp))

        //button properties
        Button(onClick = {navController.navigate("login")}) {
            Text(
                "Sign Out"
            )
        }
    }
}