package com.dyiet.app.ui

import AuthenticateScreen
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dyiet.app.ui.theme.DyietTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DyietApp (){
    DyietTheme {
        val navController = rememberNavController()
        val navActions = remember(navController) {
            NavigationActions(navController)
        }
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavHost(navController, startDestination = DyietDestinations.HOME_ROUTE, Modifier.padding(innerPadding)) {
                        composable(DyietDestinations.HOME_ROUTE) {
                            HomeScreen(navController)
                        }
                        composable(DyietDestinations.HOME_ROUTE) {
                            AuthenticateScreen()
                        }
                    }
                }
            }
}