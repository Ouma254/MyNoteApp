package com.deknowh.mynote.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.deknowh.mynote.R

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun FileScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                actions = {
                    Text(
                        text = "File Screen"
                    )
                },
                title = {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "menu"
                    )
                }
            )
        },
        bottomBar = {
            BottomAppBar() {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    TextButton(onClick = {
                        navController.navigate("notify")
                    }) {
                        Text(text = "move to the notification screen")
                    }
                }
                Icon(
                    imageVector = Icons.Default.Notifications,
                    contentDescription = "notifications"
                )
            }
        }
    ) {
        LazyVerticalGrid(
            columns = GridCells.Adaptive(100.dp),
            content = {
                items(100) {
                    Box(
                        modifier = Modifier
                            .padding(8.dp)
                            .clip(RoundedCornerShape(5.dp))
                            .background(Color.Green),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.mercedes),
                            contentDescription = "mercedes car"
                        )
                    }
                }
            }
        )
    }

}