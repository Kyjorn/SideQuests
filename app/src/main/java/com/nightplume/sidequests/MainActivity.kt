package com.nightplume.sidequests

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            //Navigation Controller
            val navController = rememberNavController()

            //Routes
            NavHost(navController = navController, startDestination = "splash") {
                composable("splash") {SplashScreen(navController)}
                composable("login") {LoginScreen(/**/)}
                composable("register") {RegisterScreen(navController)}
                composable("home") {HomeScreen(navController)}
            }

        }
    }
}