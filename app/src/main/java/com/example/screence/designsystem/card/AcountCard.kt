package com.example.screence.designsystem.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.screence.R

@Composable
fun AcountCard(
    onClick: () -> Unit,
    text: String,
    painter: Painter,
    name: String,
    number: String
) {
    Card(
        modifier = Modifier
            .width(270.dp)
            .height(80.dp),
        onClick = onClick,
        shape = RoundedCornerShape(8.dp)
    ) {
        Row(
            Modifier.fillMaxSize().padding(10.dp),
            //horizontalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier.fillMaxHeight().padding(horizontal = 16.dp),
                contentAlignment = Alignment.Center
            ){
                Text(
                    modifier = Modifier
                        .drawBehind {
                            drawCircle(
                                color = Color.Gray,
                                radius = this.size.minDimension / 2 + 20
                            )
                        },
                    text = text,
                    color = Color.Black,
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(120.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start
            ) {
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
                modifier = Modifier.size(20.dp),
                painter = painter,
                contentDescription = "icône"
            )
        }
    }
}

@PreviewScreenSizes
@Composable
fun AcountCardPreview() {
    AcountCard(
        onClick = {},
        text = "JC",
        name = "Jean-françois Clémençot",
        number = "5864331168",
        painter = painterResource(R.drawable.ic_launcher_foreground)
    )
}