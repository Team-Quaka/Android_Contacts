package com.example.contactlistapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.contactlistapp.ui.theme.ContactListAppTheme

class ContactListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContent {
            Column() {
                Row() {
                    val text = remember {
                        mutableStateOf("")
                    }

                    TextField(value = text.value, onValueChange = {
                        text.value = it
                    })
                    Button(onClick = {})
                    {
                        Text("Search", modifier = Modifier.weight(1f))
                    }
                }
                Column() {
                    ContactItem()
                    ContactItem()
                    ContactItem()
                }
            }
        }
    }
}

@Composable
fun ContactItem() {
    Row() {
        Text("dummy", modifier = Modifier.padding(10.dp, 5.dp))
        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = {
            var intent = Intent(ContactListActivity, ContactDetailActivity::class.java)
        }) {
            Text("\u2139")
        }
    }
}