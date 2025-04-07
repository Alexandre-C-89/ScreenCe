package com.example.screence.designsystem.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.screence.R

@Composable
fun AcountCard(
    onClick: () -> Unit,
    painter: Painter,
    secondPainter: Painter,
    name: String,
    number: String
){
    Card(
        modifier = Modifier.width(300.dp).height(80.dp),
        onClick = onClick
    ) {
        Row(
            Modifier.fillMaxSize(),
            //horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painter,
                contentDescription = "icône"
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column (
                modifier = Modifier.fillMaxHeight().width(120.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start
            ){
                Text(
                    text = name,
                    fontSize = 12.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = number,
                    fontSize = 12.sp
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Image(
                modifier = Modifier.size(40.dp),
                painter = secondPainter,
                contentDescription = "icône"
            )
        }
    }
}

@PreviewScreenSizes
@Composable
fun AcountCardPreview(){
    AcountCard(
        onClick = {},
        painter =  painterResource(R.drawable.ic_launcher_foreground),
        name = "Jean-françois Clémençot",
        number = "5864331168",
        secondPainter =  painterResource(R.drawable.ic_launcher_foreground)
    )
}