package com.nightplume.sidequests

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nightplume.sidequests.ui.theme.Pink40

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

        Box(modifier = Modifier.fillMaxSize()) {

            Image(
                //login background properties
                painter = painterResource(id = R.drawable.login_background),
                contentDescription = "Login Background",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .matchParentSize()
            )

            Text(
                // SideQuests title logo and properties
                "SideQuests",
                fontSize = 35.sp,
                fontWeight = Bold,
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .offset(x = 0.dp, y = 125.dp)
            )
        }
        Column(
            //column properties
            Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            OutlinedCard (
                //card background properties
                modifier = Modifier
                    .padding(15.dp)
                    .align(Alignment.CenterHorizontally)
            ) {

                OutlinedTextField(
                    //username text field properties
                    onValueChange = { newText -> username = newText },
                    value = username,
                    label = { Text("Enter username") },
                    shape = RoundedCornerShape(25.dp),
                    modifier = Modifier
                        .padding(start = 5.dp, end = 5.dp, top = 20.dp, bottom = 5.dp)
                        .fillMaxWidth()

                )

                OutlinedTextField(
                    //password text field properties
                    onValueChange = { newText -> password = newText },
                    value = password,
                    label = { Text("Enter password") },
                    shape = RoundedCornerShape(25.dp),
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth()
                )

                OutlinedButton(
                    //log in button properties
                    onClick = {/* add nav controller when done with preview*/ },
                    shape = RoundedCornerShape(20.dp),
                    colors = ButtonDefaults.outlinedButtonColors(
                        containerColor = Color.Transparent,
                        contentColor = Color.Blue,
                        disabledContainerColor = Color.LightGray,
                        disabledContentColor = Color.Gray
                    ),
                    modifier = Modifier
                        .padding(start = 5.dp, end = 5.dp, top = 6.dp, bottom = 10.dp)
                        .fillMaxWidth(1f)


                ) {
                    Text(
                        "Log in",
                        fontSize = 15.sp,
                        textDecoration = TextDecoration.Underline
                    )
                }

                Text(
                    //line break for create account
                    "────────────────OR────────────────",
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentSize(align = Alignment.Center)
                        .padding(start = 5.dp, end = 5.dp)
                    )
                OutlinedButton(
                    //create an account button properties
                    onClick = {/*add nav controller when done with preview*/},
                    shape = RoundedCornerShape(20.dp),
                    colors = ButtonDefaults.outlinedButtonColors(
                        containerColor = Color.Transparent,
                        contentColor = Color.Blue,
                        disabledContainerColor = Color.LightGray,
                        disabledContentColor = Color.Gray
                    ),
                    modifier = Modifier
                        .padding(start = 5.dp, end = 5.dp, top = 6.dp, bottom = 10.dp)
                        .fillMaxWidth()
                    ) {
                    Text(
                        "Create an Account",
                        fontSize = 15.sp,
                        textDecoration = TextDecoration.Underline
                    )
                }

                TextButton(
                    //forgot password button properties
                    onClick = {/*add nav controller when done with preview*/}) {
                    Text(
                        "Forgot password?",
                        fontSize = 15.sp,
                        textDecoration = TextDecoration.Underline
                        )
                }
            }
        }
    }
