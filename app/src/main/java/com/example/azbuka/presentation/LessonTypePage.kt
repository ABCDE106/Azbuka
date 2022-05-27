package com.example.azbuka.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun LessonTypePage(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = { navController.navigate("vowels") }) {
            Text(text = "Гласные", fontWeight = FontWeight.Bold, fontSize = 22.sp)
        }
        Button(onClick = { navController.navigate("consonants") }) {
            Text(text = "Согласные", fontWeight = FontWeight.Bold, fontSize = 22.sp)
        }
        Button(onClick = { }) {
            Text(text = "Весь алфавит", fontWeight = FontWeight.Bold, fontSize = 22.sp)
        }
    }
}