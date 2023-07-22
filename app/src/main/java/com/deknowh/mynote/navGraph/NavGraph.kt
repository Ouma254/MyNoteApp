package com.deknowh.mynote.navGraph

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.deknowh.mynote.screen.FileScreen
import com.deknowh.mynote.screen.HomeScreen
import com.deknowh.mynote.screen.LoginScreen
import com.deknowh.mynote.screen.Notification
import com.deknowh.mynote.screen.RegistrationScreen
import com.deknowh.mynote.screen.Splash

@Composable
fun Navigating() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "splash") {
        composable("splash") {
            Splash(navController = navController)
        }
        composable("login") {
            LoginScreen(navController = navController)
        }
        composable("home") {
            HomeScreen(navController = navController)
        }
        composable("file") {
            FileScreen(navController = navController)
        }
        composable("notify") {
            Notification(navController = navController)
        }
        composable("register") {
            RegistrationScreen(navController = navController)
        }
    }
}