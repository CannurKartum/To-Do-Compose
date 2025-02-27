package com.example.to_do_compose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.to_do_compose.navigation.destinations.listComposable
import com.example.to_do_compose.navigation.destinations.taskComposable
import com.example.to_do_compose.util.Constants.LIST_SCREEN


@Composable
fun SetupNavigation(
    navController: NavHostController
){
    val screen = remember(navController){
        Screens(navController = navController)
    }

    NavHost(
        navController = navController,
        startDestination = LIST_SCREEN
    ){
        listComposable(
            navigateToTaskScreen = screen.task
        )
        taskComposable(
            navigateToListScreen = screen.list
        )

    }
}