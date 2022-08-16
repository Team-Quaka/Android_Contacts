package com.example.contactlistapp
//
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.contactlistapp.ui.theme.ContactListAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        setContent {
            Row() {
                val text = remember {
                    mutableStateOf("")
                }
                TextField(value = text.value, onValueChange = {
                    text.value = it
                })
                Button(onClick = {
                    var intent = Intent(this@MainActivity, ContactListActivity::class.java)
                    intent.putExtra("username", text.value)
                    startActivity(intent)
                }) {
                    Text("Login", modifier = Modifier.weight(1f))
                }
            }
        }
    }
}
