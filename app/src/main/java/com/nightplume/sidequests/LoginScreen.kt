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
* After splash the app should come here first.
* Only exception (eventually) will be for registering beforehand.
* Login will go to either the Home or the 'Forgot user/pass' screen from here.
*/
    @Composable
    fun LoginScreen(navController: NavController) {

        Column {

            //text properties
            Text("Login")
            Spacer(modifier = Modifier.height(10.dp))

            //button properties
            Button(onClick = {navController.navigate("home")}) {
                Text("Sign in")
            }
        }
    }
