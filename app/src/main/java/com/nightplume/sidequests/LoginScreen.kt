package com.nightplume.sidequests

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nightplume.sidequests.ui.theme.DarkBrown
import com.nightplume.sidequests.ui.theme.LightBrown
import com.nightplume.sidequests.ui.theme.LightYellow

/*
* After splash the app should come here first.
* Only exception (eventually) will be for registering beforehand.
* If credentials are bad then the user will be prompted to retry (not implemented currently)
* For now, registering for an account will be on the 'Login' screen.
* Login will go to either the Home or the 'Forgot user/pass' screen from here.
*/

                                /* REMOVE PREVIEW BEFORE DEPLOYMENT*/
    @Preview
    @Composable
fun LoginScreenPreview (){
    LoginScreen()
}
    @Composable
    fun LoginScreen(/*navController: NavController*/) { //<---REMOVE COMMENT WHEN DONE WITH PREVIEW
        var username by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        Box(
            //box for background and title
            modifier = Modifier
                .fillMaxSize()
        ) {

            Image(
                //login background properties
                painter = painterResource(id = R.drawable.login_background),
                contentDescription = "Login Background",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .matchParentSize()
            )

            Image(
                //sidequests logo
                painter = painterResource(id = R.drawable.sidequestslogo_v3),
                contentDescription = "",
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .size(190.dp)
                    .offset(y = 78.5.dp)

            )
        }
        
        Column(
            //column properties
            Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            OutlinedTextField(
                //username text field properties
                onValueChange = { newText -> username = newText },
                value = username,
                label = { Text(
                    "Enter username",
                    color = DarkBrown,
                    fontWeight = Bold
                )},
                maxLines = 1,
                modifier = Modifier
                    .padding(start = 5.dp, end = 5.dp, top = 20.dp, bottom = 5.dp)
                    .offset(x = 3.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = DarkBrown,
                    unfocusedBorderColor = LightBrown,
                    focusedTextColor = DarkBrown
                ),
                textStyle = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = Bold
                )
            )

            OutlinedTextField(
                //password text field properties
                onValueChange = { newText -> password = newText },

                value = password,
                label = { Text(
                    "Enter password",
                    fontWeight = Bold,
                    color = DarkBrown
                    )},
                maxLines = 1,
                modifier = Modifier
                    .padding(start = 5.dp, end = 5.dp , top = 5.dp , bottom = 20.dp )
                    .offset(x = 3.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = DarkBrown,
                    unfocusedBorderColor = LightBrown,
                    focusedTextColor = DarkBrown
                ),
                textStyle = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = Bold
                )
            )

            TextButton(
                //forgot password button properties
                onClick = {/*add nav controller when done with preview*/},
                modifier = Modifier
                    .align(Alignment.End)
                    .offset(x = (-40).dp, y = (-18).dp)
            ) {
                Text(
                    "Forgot password?",
                    fontSize = 15.sp,
                    fontWeight = Bold,
                    color = DarkBrown,
                    textDecoration = TextDecoration.Underline
                )
            }

            OutlinedButton(
                //log in button properties
                onClick = {/* add nav controller when done with preview*/ },
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(1.5.dp, color = LightBrown),
                modifier = Modifier
                    .padding(start = 5.dp, end = 5.dp, top = 6.dp, bottom = 10.dp)
                    .offset(y = 30.dp)
            ) {
                Text(
                    "LOGIN",
                    color = DarkBrown,
                    fontSize = 15.sp,
                    fontWeight = Bold,
                    textDecoration = TextDecoration.Underline
                )
            }

            OutlinedButton(
                //create an account button properties
                onClick = {/*add nav controller when done with preview*/},
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(1.5.dp, color = LightBrown),
                modifier = Modifier
                    .padding(start = 5.dp, end = 5.dp, top = 6.dp, bottom = 10.dp)
                    .offset(y = 30.dp)
            ) {
                Text(
                    "Create an Account",
                    color = DarkBrown,
                    fontSize = 15.sp,
                    textDecoration = TextDecoration.Underline
                )
            }
        }
    }
