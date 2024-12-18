package com.example.myappnavigation.theme.ui

package com.example.myappnavigation.ui

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myappnavigation.ui.screens.FirstScreen
import com.example.myappnavigation.ui.screens.SecondScreen
import com.example.myappnavigation.ui.screens.ThirdScreen
import com.example.myappnavigation.ui.LocationViewModel

@Composable
fun MyApp(navController: NavHostController) {
    val locationViewModel: LocationViewModel = viewModel()

    NavHost(navController = navController, startDestination = "firstscreen") {
        composable("firstscreen") {
            FirstScreen(onNavigate = { navController.navigate("secondscreen") })
        }
        composable("secondscreen") {
            SecondScreen(locationViewModel = locationViewModel, onNavigate = { navController.navigate("thirdscreen") })
        }
        composable("thirdscreen") {
            ThirdScreen()
        }
    }
}
