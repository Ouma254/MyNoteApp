package com.deknowh.mynote.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
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
fun Notification(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                modifier = Modifier
                    .background(Color.LightGray),
                actions = {
                    Text(
                        text = "Notifications"
                          )
                },
                title = {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "notifications"
                    )
                    Icon(imageVector = Icons.Default.Home, contentDescription = "home")
                },

            )
        },
        bottomBar = {
            BottomAppBar(
                modifier = Modifier
                    .background(Color.LightGray)
            ) {

                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "userAccount"
                )
                TextButton(
                    onClick = { navController.navigate("login") }
                ) {
                    Text(
                        text = "Log out"
                    )
                }
            }
        }
    ) {
        Box(
            modifier = Modifier.padding(8.dp),
            contentAlignment = Alignment.Center
        ) {
            LazyColumn() {
               // LazyHorizontalGrid(
                //    rows = GridCells.Fixed(1),
                  //  content = {
                        items(20) {
                            Box(modifier = Modifier
                                .padding(8.dp)
                                .clip(RoundedCornerShape(5.dp))
                            ) {
                                Column() {
                                    Image(
                                        painter = painterResource(id = R.drawable.mercedes),
                                        contentDescription = "cars",
                                        modifier = Modifier.size(400.dp)
                                    )
                                    Text(text = "A german machine")
                                }

                            }
                        }
                    }
                //)
           // }

        }
    }
}