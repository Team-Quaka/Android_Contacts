package com.example.contactlistapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.activity.ComponentActivity
import androidx.core.content.ContextCompat.startActivity


class ContactListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var cls = this;

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

                Button(onClick = {
                    val intent = Intent(this@ContactListActivity, AddContactActivity::class.java)
                    startActivity(intent)
                }) {
                    Text(text = "Add Contact")
                }
            }
        }
    }
}

@Composable
fun ContactItem() {
    val context = LocalContext.current
    Row() {
        LocalContext.current

        Text("dummy", modifier = Modifier.padding(10.dp, 5.dp))
        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = {
            var intent = Intent(context, ContactDetailActivity::class.java)
            startActivity(context, intent, null)
        }) {
            Text("\u2139")
        }
    }
}