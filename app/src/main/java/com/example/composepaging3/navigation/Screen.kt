package com.example.composepaging3.navigation

sealed class Screen(val route: String){
    object Home: Screen("home_screen")
}
