package com.deknowh.mynote.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.deknowh.mynote.R

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun RegistrationScreen(navController: NavController) {
//    Scaffold(
//        topBar = {
//            TopAppBar(
//                title = {
//                    Text(text = "Register")
//                },
//                actions = {
//                    IconButton(
//                        onClick = { navController.navigate("login") }
//                    ) {
//                        Icon(
//                            imageVector = Icons.Default.AccountCircle,
//                            contentDescription = "userAccount"
//                        )
//                    }
//                }
//            )
//        }
//    ) {
//
//    }
    val name by remember {
        mutableStateOf("")
    }
    val phone by remember {
        mutableStateOf("")
    }
    val email by remember {
        mutableStateOf("")
    }
    val password by remember {
        mutableStateOf("")
    }
    val confirmpasswd by remember {
        mutableStateOf("")
    }
    val focusManager = LocalFocusManager.current
    val focusRequest = FocusRequester()
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .clip(RoundedCornerShape(3.dp))
            .background(Color.Cyan)
            .height(600.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.width(350.dp)
        ) {
            Text(
                text = "Sign Up",
                modifier = Modifier.padding(10.dp),
                fontWeight = FontWeight.ExtraBold,
                color = Color.DarkGray
            )
            OutlinedTextField(
                value = name,
                onValueChange = { },
                label = {
                    Text(text = "Enter Name")
                },
                keyboardOptions = KeyboardOptions.Default.copy(
                    capitalization = KeyboardCapitalization.Sentences,
                    autoCorrect = true,
                    keyboardType = KeyboardType.Text,
                    imeAction = ImeAction.Next
                ),
                keyboardActions = KeyboardActions(onNext = {
                    focusManager.moveFocus(FocusDirection.Down)
                }),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 6.dp, start = 0.dp, end = 0.dp, bottom = 6.dp)

            )
            Spacer(modifier = Modifier.padding(8.dp))
            OutlinedTextField(
                value = phone,
                onValueChange = { },
                label = {
                    Text(text = "Enter Phone No.")
                },
                keyboardOptions = KeyboardOptions.Default.copy(
                    capitalization = KeyboardCapitalization.Sentences,
                    autoCorrect = true,
                    keyboardType = KeyboardType.Number,
                    imeAction = ImeAction.Next
                ),
                keyboardActions = KeyboardActions(onNext = {
                    focusManager.moveFocus(FocusDirection.Down)
                }),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 6.dp, start = 0.dp, end = 0.dp, bottom = 6.dp)

            )
            Spacer(modifier = Modifier.padding(8.dp))
            OutlinedTextField(
                value = name,
                onValueChange = { },
                label = {
                    Text(text = "Enter EmailAddress")
                },
                keyboardOptions = KeyboardOptions.Default.copy(
                    capitalization = KeyboardCapitalization.Sentences,
                    autoCorrect = true,
                    keyboardType = KeyboardType.Email,
                    imeAction = ImeAction.Next
                ),
                keyboardActions = KeyboardActions(onNext = {
                    focusManager.moveFocus(FocusDirection.Down)
                }),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 6.dp, start = 0.dp, end = 0.dp, bottom = 6.dp)

            )
            Spacer(modifier = Modifier.padding(8.dp))
            OutlinedTextField(
                value = name,
                onValueChange = { },
                label = {
                    Text(text = "Enter Password")
                },
                keyboardOptions = KeyboardOptions.Default.copy(
                    capitalization = KeyboardCapitalization.Sentences,
                    autoCorrect = true,
                    keyboardType = KeyboardType.Password,
                    imeAction = ImeAction.Next
                ),
                keyboardActions = KeyboardActions(onNext = {
                    focusManager.moveFocus(FocusDirection.Down)
                }),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 6.dp, start = 0.dp, end = 0.dp, bottom = 6.dp)

            )
            OutlinedTextField(
                value = name,
                onValueChange = { },
                label = {
                    Text(text = "Confirm Password")
                },
                keyboardOptions = KeyboardOptions.Default.copy(
                    capitalization = KeyboardCapitalization.Sentences,
                    autoCorrect = true,
                    keyboardType = KeyboardType.Password,
                    imeAction = ImeAction.Next
                ),
                keyboardActions = KeyboardActions(onNext = {
                    focusManager.moveFocus(FocusDirection.Down)
                }),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 6.dp, start = 0.dp, end = 0.dp, bottom = 6.dp)

            )
            Spacer(modifier = Modifier.padding(8.dp))
            Button(
                onClick = { navController.navigate("login") }
            ) {
                Text(text = "Sign Up")
            }
        }
    }

}