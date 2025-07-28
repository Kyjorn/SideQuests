package com.nightplume.sidequests

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
                composable("login") {LoginScreen(navController)}
                composable("home") {HomeScreen(navController)}
            }

        }
    }
}
