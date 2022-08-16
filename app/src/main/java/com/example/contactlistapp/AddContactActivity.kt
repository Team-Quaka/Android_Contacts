package com.example.contactlistapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.contactlistapp.ui.theme.ContactListAppTheme

class AddContactActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column() {
                val phoneNumber = remember {
                    mutableStateOf("")
                }
                val contactName = remember {
                    mutableStateOf("")
                }
                Row() {
                    Text(text = "phone")
                    TextField(value = phoneNumber.value, onValueChange = {
                        phoneNumber.value = it
                    })
                }
                Row() {
                    Text(text = "name")
                    TextField(value = contactName.value, onValueChange = {
                        contactName.value = it
                    })
                }
                
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "ADD CONTACT")
                }
            }
        }
    }
}
