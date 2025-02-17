package com.example.to_do_compose.ui.screens.list

import androidx.compose.foundation.background
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.to_do_compose.R

@Composable
fun ListAppBar() {
    DefaultListAppBar()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DefaultListAppBar(){
    TopAppBar(
        title = { Text(
            text = "Tasks"
        ) },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = colorResource(id = R.color.purple_500),
            titleContentColor = colorResource(id = R.color.white)
        )
    )
}
@Composable
@Preview
private fun DefaultListAppBarPreview(){
    DefaultListAppBar()
}
