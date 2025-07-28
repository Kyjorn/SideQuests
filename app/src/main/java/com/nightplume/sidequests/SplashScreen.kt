package com.nightplume.sidequests


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import kotlinx.coroutines.delay

/*
* App starts on this screen.
* The app then shows an animated logo or display.
* After a delay then moves into the login screen
*/

@Composable
fun SplashScreen (navController: NavController) {

    //delay timer for splash screen
    LaunchedEffect(Unit) {
        delay(1500L)
        navController.navigate("login") {

        }
    }
    //[splash logo or animation goes here]
    
    //splash properties
    Box(
        Modifier
            .fillMaxSize(),
            contentAlignment = Alignment.Center
    ){
        Text(
            "SideQuests",
            fontSize = 30.sp
        )
    }
}