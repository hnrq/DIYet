package com.diyet.app.ui

import AuthenticateScreen
import HomeScreen
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
import com.diyet.app.ui.theme.DiyetTheme


@Composable
fun DiyetApp() {
    DiyetTheme {
        val navController = rememberNavController()
        val navActions = remember(navController) {
            NavigationActions(navController)
        }
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            NavHost(
                navController,
                startDestination = DiyetDestinations.HOME_ROUTE,
                Modifier.padding(innerPadding)
            ) {
                composable(DiyetDestinations.HOME_ROUTE) {
                    HomeScreen()
                }
                composable(DiyetDestinations.HOME_ROUTE) {
                    AuthenticateScreen()
                }
            }
        }
    }
}