package de.niklasbecker.wheinachtswald.Styling

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color

//Reusable Headline
@Composable
fun CustomBoldHeadline(text: String){

    Text(text,
        fontSize = 40.sp,
        fontWeight = FontWeight.Bold)

}

@Composable
fun CustomTagText(text: String){

        Text(text,
            fontSize = 20.sp,
            modifier = Modifier.customTagTextModifier()

        )

    }



@Composable
fun CustomAnzahl(text: String){
    Text(text,
        fontSize = 20.sp,
        color = Color.Green,
        modifier = Modifier
            .customTagTextModifier()
            .wrapContentWidth(Alignment.End)
            .padding(end = 10.dp)
    )
}

//ReusableModifier
fun Modifier.customTagTextModifier(): Modifier{

    return this
        .width(150.dp)
        .height(50.dp)
        .wrapContentHeight(align = Alignment.CenterVertically)

}

