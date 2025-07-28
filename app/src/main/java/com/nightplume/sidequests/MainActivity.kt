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

            //navigation Controller
            val navController = rememberNavController()

            //routes
            NavHost(navController = navController, startDestination = "login") {
                //composable("splash") { SplashScreen(navController) }
                composable("login") {LoginScreen(navController) }
                composable("home") {HomeScreen(navController)}
            }

        }
    }
}
