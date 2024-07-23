package com.akshat.jettipappudemycourse.widgets

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


val IconbuttonSizeModifier = Modifier.size(40.dp)

@Composable
fun RoundIconButton(
    modifier: Modifier = Modifier,
    imageVector: ImageVector,
    onClick: () -> Unit,
    tint: Color = Color.Black.copy(alpha = 0.8f),
    backgroundColor: Color = MaterialTheme.colorScheme.background,
    elevation: Dp = 4.dp
) {

    Card(
        modifier = Modifier
            .padding(all = 4.dp)
            .clickable(onClick = onClick)
            .then(IconbuttonSizeModifier),
        shape = CircleShape,
        colors = CardColors(
            containerColor = backgroundColor,
            contentColor = Color.Black,
            disabledContentColor = Color.Gray,
            disabledContainerColor = Color.Black
        ),
        elevation = CardDefaults.cardElevation(elevation)
    ) {

        Icon(
            imageVector = imageVector,
            contentDescription = "Plus or Minus icon",
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
            tint = tint
        )

    }

}