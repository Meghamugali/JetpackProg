package com.example.jetpackprog

import android.R
import android.annotation.SuppressLint
import android.app.Activity
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val cardvisible = mutableStateOf(true)
@Composable
fun CardWithMultipleViews() {
    val dark_blue = Color(0xFF212431)
    val paddingModifier =
        Modifier.padding(top = 120.dp, start = 3.dp, end = 3.dp, bottom = 200.dp)
    if (cardvisible.value) {
        Card(
            backgroundColor = dark_blue,
            elevation = 10.dp,
            modifier = paddingModifier
                .padding(10.dp)
                .clip(RoundedCornerShape(20.dp))
        ) {
            Column(modifier = Modifier.padding(start = 14.dp, top = 8.dp)) {
                Text(
                    "Stay in the Know", fontWeight = FontWeight.Bold,
                    color = Color.White, fontSize = 24.sp
                )
            }
            Column(modifier = Modifier.padding(start = 14.dp, top = 48.dp, end = 145.dp)) {
                Text(
                    "Get notifications about your backup status, highlights, flashbacks, and more. Customize the notifications you receive in Capsyl's Notification Manager.",
                    color = Color.White, fontSize = 14.sp
                )
            }
            Column(modifier = Modifier.padding(start = 8.dp, top = 140.dp)) {
                val context = LocalContext.current
                val Holoblue = Color(0xFF0099CC)
                Button(
                    onClick = {
                        Toast.makeText(context, "Clicked", Toast.LENGTH_LONG).show()
                    },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Holoblue),
                    modifier = Modifier.padding(all = Dp(10F)),
                    enabled = true,
                    border = BorderStroke(width = 0.dp, brush = SolidColor(Color.White)),
                    shape = RoundedCornerShape(20.dp),
                )
                {
                    Text(
                        text = "Allow Notifications",
                        color = colorResource(R.color.white),

                        )
                }
            }
            Column(modifier = Modifier.padding(start = 274.dp)) {
                IconButton(onClick = { cardvisible.value = false }) {
                    Image(
                        painterResource(R.drawable.ic_menu_close_clear_cancel),
                        contentDescription = "",
                    )
                }
            }

            Column(
                modifier = Modifier
                    .padding(start = 228.dp, top = 48.dp, bottom = 48.dp)
                    .fillMaxWidth()
                    .fillMaxHeight()
            )
            {
                ProfilePictureComposable()
            }
        }

    }
}
