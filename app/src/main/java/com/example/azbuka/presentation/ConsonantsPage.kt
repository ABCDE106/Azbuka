package com.example.azbuka.presentation

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.azbuka.R
import com.example.azbuka.components.LetterCard
import com.example.azbuka.models.Letter

// Согласные
@Composable
fun ConsonantsPage(navController: NavHostController) {
    val listLetters = listOf<Letter>(
        Letter("б", R.raw.b_sound),
        Letter("в", R.raw.v_sound),
        Letter("г", R.raw.g_sound),
        Letter("д", R.raw.d_sound),
        Letter("ж", R.raw.io_sound),
        Letter("з", R.raw.z_sound),
        Letter("й", R.raw.ii_sound),
        Letter("к", R.raw.k_sound),
        Letter("л", R.raw.l_sound),
        Letter("м", R.raw.m_sound),
        Letter("н", R.raw.n_sound),
        Letter("п", R.raw.p_sound),
        Letter("р", R.raw.r_sound),
        Letter("с", R.raw.s_sound),
        Letter("т", R.raw.t_sound),
        Letter("ф", R.raw.f_sound),
        Letter("х", R.raw.h_sound),
        Letter("ц", R.raw.c_sound),
        Letter("ч", R.raw.ch_sound),
        Letter("ш", R.raw.sh_sound),
        Letter("щ", R.raw.shh_sound),
        Letter("ъ", R.raw.tz_sound),
        Letter("ь", R.raw.mz_sound),
    )
    Column(modifier = Modifier.fillMaxSize().verticalScroll(ScrollState(1)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        for (letter in listLetters) {
            LetterCard(letter = letter)
        }
    }
}