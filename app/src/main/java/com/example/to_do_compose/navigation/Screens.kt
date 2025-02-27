package com.example.to_do_compose.navigation

import androidx.navigation.NavHostController
import com.example.to_do_compose.util.Action
import com.example.to_do_compose.util.Constants.LIST_SCREEN


class Screens(navController: NavHostController) {

val list:(Action)-> Unit = { action ->
    navController.navigate(route = "list/${action.name}") {
        popUpTo(LIST_SCREEN){inclusive = true}
    }
}
    val task:(Int) -> Unit ={ taskId ->
        navController.navigate("task/$taskId")
    }
}