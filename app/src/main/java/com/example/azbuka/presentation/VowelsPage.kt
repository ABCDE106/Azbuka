package com.example.azbuka.presentation

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.azbuka.R
import com.example.azbuka.components.LetterCard
import com.example.azbuka.models.Letter

@Composable
fun VowelsPage(navController: NavHostController) {
    val listLetters = listOf<Letter>(
        Letter("а", R.raw.a_sound),
        Letter("е"),
        Letter("ё"),
        Letter("и"),
        Letter("о"),
        Letter("у"),
        Letter("ы"),
        Letter("э"),
        Letter("ю"),
        Letter("я"),
    )
    Column(modifier = Modifier.fillMaxSize().verticalScroll(ScrollState(1)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        for (letter in listLetters) {
            LetterCard(letter = letter)
        }
    }
}