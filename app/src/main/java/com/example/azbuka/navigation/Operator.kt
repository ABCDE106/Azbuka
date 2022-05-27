package com.example.azbuka.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.azbuka.presentation.*

@Composable
fun Operator() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "menu") {
        composable("alphabet") { AlphabetPage(navController) }
        composable("menu") { MenuPage(navController) }
        composable("lesson_type") { LessonTypePage(navController) }
        composable("vowels") { VowelsPage(navController) }
        composable("consonants") { ConsonantsPage(navController) }
    }
}