package com.deknowh.mynote.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavController) {
    val emailId by remember {
        mutableStateOf("")
    }
    val passwdId by remember {
        mutableStateOf("")
    }
    Box(
        modifier = Modifier
            .padding(5.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(10.dp))
            .height(400.dp)
            .background(Color.Cyan),
        Alignment.Center
        )  {
            Column(
             horizontalAlignment = Alignment.CenterHorizontally,
             verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Sign In Page",
                    modifier = Modifier
                        .padding(10.dp),
                    fontWeight = FontWeight.ExtraBold,


                    )
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    OutlinedTextField(
                        value = emailId,
                        onValueChange = {

                        },
                        label = {
                           Text(text = "Enter email")
                        },
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Email,
                            imeAction = ImeAction.Default
                        ),
                    )
                    Spacer(modifier = Modifier.padding(10.dp))
                    OutlinedTextField(
                        value = passwdId,
                        onValueChange = {

                        },
                        label = {
                            Text(text = "Enter password")
                        },
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Password,
                            imeAction = ImeAction.Done
                        ),
                        visualTransformation = PasswordVisualTransformation()
                    )
                    Spacer(modifier = Modifier.padding(8.dp))
                    Button(
                        onClick = { navController.navigate("home") },
                        modifier = Modifier
                    ) {
                        Text(text = "Sign In")
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Spacer(modifier = Modifier.padding(10.dp))
                        Text(
                            text = "Do you have an account?"
                        )
                        TextButton(
                            onClick = { navController.navigate("register")}
                        ) {
                            Text(
                                text = "Create Account"
                            )
                        }
                    }


                }


            }
    }
}