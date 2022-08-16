package com.example.contactlistapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.contactlistapp.ui.theme.ContactListAppTheme

class ContactDetailActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContent {
            Column() {
                Row() {
                    Text("Mobile")
                    Spacer(modifier = Modifier.weight(1f))
                    Text("09918822487")
                }
                Row() {
                    Text("Contact Name")
                    Spacer(modifier = Modifier.weight(1f))
                    Text("Hanif Mohammadi")
                }
            }
        }
    }
}