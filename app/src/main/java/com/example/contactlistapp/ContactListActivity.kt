package com.example.contactlistapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
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
        val username = intent.getStringExtra("username")

        val queue =Volley

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
        Text("dummy", modifier = Modifier.padding(10.dp, 5.dp))
        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = {
            var intent = Intent(context, ContactDetailActivity::class.java)
            intent.putExtra("name", "ali")
            intent.putExtra("phonenumber", "09123134134")

            startActivity(context, intent, null)
        }) {
            Text("\u2139")
        }
    }
}