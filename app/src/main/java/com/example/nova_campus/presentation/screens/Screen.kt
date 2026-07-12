package com.example.novacampus.presentation.screens

sealed class Screen (val route: String){
    object SplashScreen: Screen("splash_screen")
    object HomeScreen: Screen("login_screen")
}