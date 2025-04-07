package com.example.screence

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.screence.designsystem.card.AcountCard
import com.example.screence.ui.theme.ScreenCeTheme
import kotlin.math.asin

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ScreenCeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    Home(
                        infoClick = {},
                        assistanceClick = {}
                    )
                }
            }
        }
    }
}

@Composable
fun Home(
    infoClick: () -> Unit,
    assistanceClick: () -> Unit,
) {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.tour_eiffel),
            contentDescription = "image de fond",
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier.fillMaxSize().padding(16.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column (
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    TextButton(
                        onClick = infoClick
                    ) {
                        Text(
                            text = "Infos légales",
                            fontSize = 16.sp,
                            color = Color.White
                        )
                    }
                    TextButton(
                        onClick = assistanceClick
                    ) {
                        Text(
                            text = "Assitance",
                            fontSize = 16.sp,
                            color = Color.White
                        )
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
                Image(
                    painter = painterResource(R.drawable.ic_launcher_foreground),
                    contentDescription = "logo"
                )
            }
            AcountCard(
                onClick = {},
                text = "JC",
                painter = painterResource(R.drawable.ic_clear),
                name = "Jean-François Herbert",
                number = "184635138432"
            )
        }
    }
}

@Preview
@Composable
fun HomePreview() {
    Home(
        infoClick = {},
        assistanceClick = {}
    )
}