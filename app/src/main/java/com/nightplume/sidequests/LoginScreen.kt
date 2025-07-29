package com.nightplume.sidequests

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.nightplume.sidequests.ui.theme.Pink40
import com.nightplume.sidequests.ui.theme.TextBox

/*
* After splash the app should come here first.
* Only exception (eventually) will be for registering beforehand.
* Login will go to either the Home or the 'Forgot user/pass' screen from here.
*/
    @Composable
    fun LoginScreen(navController: NavController) {
        var username by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

    Column (
            //column properties
            Modifier
                .background(color = Pink40)
                .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
        ){
        //login text properties
        Text(
            "Login",
            fontSize = 20.sp,
            modifier = Modifier
                .wrapContentSize(Alignment.TopStart)
        )

        Spacer(modifier = Modifier.height(10.dp))
        
            //box for first text field and the login label
            Box(){

                //username text field properties
                TextBox(
                    labelText = "Username",
                    textBox = username,
                    onValueChange = {newText -> username = newText}
                )
            }

            //password text field properties
            TextBox(
                labelText = "Password",
                textBox = password,
                onValueChange = {newText -> password = newText}
            )

            //sign in button properties
            Button(onClick = {navController.navigate("home")}) {
                Text("Sign in")
            }
        }
    }
