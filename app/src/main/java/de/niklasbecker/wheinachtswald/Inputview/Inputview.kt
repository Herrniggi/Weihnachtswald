package de.niklasbecker.wheinachtswald.Inputview

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import de.niklasbecker.wheinachtswald.Inputview.model.InputViewModel
import de.niklasbecker.wheinachtswald.R
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.graphics.Color
import de.niklasbecker.wheinachtswald.Styling.CustomAnzahl
import de.niklasbecker.wheinachtswald.Styling.CustomBoldHeadline
import de.niklasbecker.wheinachtswald.Styling.CustomTagText

//Variablen



@Composable
fun InputView( inputViewModel: InputViewModel) {
    Column(Modifier.fillMaxSize().verticalScroll(rememberScrollState())) {
        Column(modifier = Modifier.padding(5.dp)) {
            GreetingInputView(inputViewModel)
        }
    }
}

@Composable
fun GreetingInputView(inputViewModel: InputViewModel){
    Trinken(inputViewModel)
    Essen(inputViewModel)
    Tassenpfand(inputViewModel)
    Reset(inputViewModel)
    Statistik(inputViewModel)


}


//Großegruppen

@Composable
fun Trinken(inputViewModel: InputViewModel){
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
        CustomBoldHeadline(stringResource(R.string.getraenke))
        Endpreis(inputViewModel)
    }
    Gluehwein(inputViewModel)
    Kinderpunsch(inputViewModel)
    Bellaris(inputViewModel)
    Cola(inputViewModel)
    Fanta(inputViewModel)
    Spezi(inputViewModel)
    Apfelshorle(inputViewModel)
    Wasser(inputViewModel)
    Johannisbeer(inputViewModel)
    Bier(inputViewModel)

}

@Composable
fun Essen(inputViewModel: InputViewModel){
    CustomBoldHeadline(text = stringResource(R.string.essen))
    Burger(inputViewModel)
    Gemueserolle(inputViewModel)

}


//Teilgruppen

@Composable
fun Gluehwein(inputViewModel: InputViewModel){
    val gluehweinAnzahl by inputViewModel.gluehweinAnzahl.observeAsState(0)

    Row ()
    {
        CustomTagText(text = stringResource(R.string.gluehwein))

        IconButton(
                onClick = { inputViewModel.minusGluehwein() }) {

            Icon(imageVector = Icons.Outlined.ArrowBack, contentDescription = "Delete")
        }

        IconButton(onClick = { inputViewModel.plusGluehwein() }) {

            Icon(imageVector = Icons.Outlined.Add, contentDescription = "Add")

        }

        CustomAnzahl(gluehweinAnzahl.toString())

    }


}

@Composable
fun Kinderpunsch(inputViewModel: InputViewModel){
    val kinderpunschAnzahl by inputViewModel.kinderpunschAnzahl.observeAsState(0)

    Row ()
    {
        CustomTagText(text = stringResource(R.string.kinderpunsch))

        IconButton(
            onClick = { inputViewModel.minusKinderpunsch() }) {

            Icon(imageVector = Icons.Outlined.ArrowBack, contentDescription = "Delete")
        }

        IconButton(onClick = { inputViewModel.plusKinderpunsch() }) {

            Icon(imageVector = Icons.Outlined.Add, contentDescription = "Add")

        }

        CustomAnzahl(kinderpunschAnzahl.toString())
    }

}

@Composable
fun Tassenpfand(inputViewModel: InputViewModel){
    val pfandAnzahl by inputViewModel.pfandAnzahl.observeAsState(0)
    
    CustomBoldHeadline(text = stringResource(R.string.pfand))
    
    Row ()
    {
        CustomTagText(text = stringResource(R.string.pfand))

        IconButton(
            onClick = { inputViewModel.minusRueckgabe() }) {

            Icon(imageVector = Icons.Outlined.ArrowBack, contentDescription = "Delete")
        }

        IconButton(onClick = { inputViewModel.plusRueckgabe() }) {

            Icon(imageVector = Icons.Outlined.Add, contentDescription = "Add")

        }

        CustomAnzahl(pfandAnzahl.toString())
    }

}

@Composable
fun Bellaris(inputViewModel: InputViewModel){
    val bellarisAnzahl by inputViewModel.bellarisAnzahl.observeAsState(0)

    Row ()
    {
        CustomTagText(text = stringResource(R.string.bellaris))

        IconButton(
            onClick = { inputViewModel.minusBellaris() }) {

            Icon(imageVector = Icons.Outlined.ArrowBack, contentDescription = "Delete")
        }

        IconButton(onClick = { inputViewModel.plusBellaris() }) {

            Icon(imageVector = Icons.Outlined.Add, contentDescription = "Add")

        }

        CustomAnzahl(bellarisAnzahl.toString())
    }

}

@Composable
fun Cola(inputViewModel: InputViewModel){
    val colaAnzahl by inputViewModel.colaAnzahl.observeAsState(0)

    Row ()
    {
        CustomTagText(text = stringResource(R.string.cola))

        IconButton(
            onClick = { inputViewModel.minusCola() }) {

            Icon(imageVector = Icons.Outlined.ArrowBack, contentDescription = "Delete")
        }

        IconButton(onClick = { inputViewModel.plusCola() }) {

            Icon(imageVector = Icons.Outlined.Add, contentDescription = "Add")

        }

        CustomAnzahl(colaAnzahl.toString())
    }

}

@Composable
fun Fanta(inputViewModel: InputViewModel){
    val fantaAnzahl by inputViewModel.fantaAnzahl.observeAsState(0)

    Row ()
    {
        CustomTagText(text = stringResource(R.string.fanta))

        IconButton(
            onClick = { inputViewModel.minusFanta() }) {

            Icon(imageVector = Icons.Outlined.ArrowBack, contentDescription = "Delete")
        }

        IconButton(onClick = { inputViewModel.plusFanta() }) {

            Icon(imageVector = Icons.Outlined.Add, contentDescription = "Add")

        }

        CustomAnzahl(fantaAnzahl.toString())
    }

}

@Composable
fun Spezi(inputViewModel: InputViewModel){
    val speziAnzahl by inputViewModel.speziAnzahl.observeAsState(0)

    Row ()
    {
        CustomTagText(text = stringResource(R.string.spezi))

        IconButton(
            onClick = { inputViewModel.minusSpezi() }) {

            Icon(imageVector = Icons.Outlined.ArrowBack, contentDescription = "Delete")
        }

        IconButton(onClick = { inputViewModel.plusSpezi() }) {

            Icon(imageVector = Icons.Outlined.Add, contentDescription = "Add")

        }

        CustomAnzahl(speziAnzahl.toString())
    }

}

@Composable
fun Apfelshorle(inputViewModel: InputViewModel){
    val apfelschorleAnzahl by inputViewModel.apfelschorleAnzahl.observeAsState(0)

    Row ()
    {
        CustomTagText(text = stringResource(R.string.apfelschorle))

        IconButton(
            onClick = { inputViewModel.minusApfelschorle() }) {

            Icon(imageVector = Icons.Outlined.ArrowBack, contentDescription = "Delete")
        }

        IconButton(onClick = { inputViewModel.plusApfelschorle() }) {

            Icon(imageVector = Icons.Outlined.Add, contentDescription = "Add")

        }

        CustomAnzahl(apfelschorleAnzahl.toString())
    }

}

@Composable
fun Wasser(inputViewModel: InputViewModel){
    val wasserAnzahl by inputViewModel.wasserAnzahl.observeAsState(0)

    Row ()
    {
        CustomTagText(text = stringResource(R.string.wasser))

        IconButton(
            onClick = { inputViewModel.minusWasser() }) {

            Icon(imageVector = Icons.Outlined.ArrowBack, contentDescription = "Delete")
        }

        IconButton(onClick = { inputViewModel.plusWasser() }) {

            Icon(imageVector = Icons.Outlined.Add, contentDescription = "Add")

        }

        CustomAnzahl(wasserAnzahl.toString())
    }

}

@Composable
fun Johannisbeer(inputViewModel: InputViewModel){
    val johannisbeerAnzahl by inputViewModel.johannisbeerAnzahl.observeAsState(0)

    Row ()
    {
        CustomTagText(text = stringResource(R.string.johannisbeer))

        IconButton(
            onClick = { inputViewModel.minusJohannisbeer() }) {

            Icon(imageVector = Icons.Outlined.ArrowBack, contentDescription = "Delete")
        }

        IconButton(onClick = { inputViewModel.plusJohannisbeer() }) {

            Icon(imageVector = Icons.Outlined.Add, contentDescription = "Add")

        }

        CustomAnzahl(johannisbeerAnzahl.toString())
    }

}

@Composable
fun Bier(inputViewModel: InputViewModel){
    val bierAnzahl by inputViewModel.bierAnzahl.observeAsState(0)

    Row ()
    {
        CustomTagText(text = stringResource(R.string.bier))

        IconButton(
            onClick = { inputViewModel.minusBier() }) {

            Icon(imageVector = Icons.Outlined.ArrowBack, contentDescription = "Delete")
        }

        IconButton(onClick = { inputViewModel.plusBier() }) {

            Icon(imageVector = Icons.Outlined.Add, contentDescription = "Add")

        }

        CustomAnzahl(bierAnzahl.toString())
    }

}

@Composable
fun Burger(inputViewModel: InputViewModel){
    val burgerAnzahl by inputViewModel.burgerAnzahl.observeAsState(0)

    Row ()
    {
        CustomTagText(text = stringResource(R.string.burger))

        IconButton(
            onClick = { inputViewModel.minusBurger() }) {

            Icon(imageVector = Icons.Outlined.ArrowBack, contentDescription = "Delete")
        }

        IconButton(onClick = { inputViewModel.plusBurger() }) {

            Icon(imageVector = Icons.Outlined.Add, contentDescription = "Add")

        }

        CustomAnzahl(burgerAnzahl.toString())


    }

}

@Composable
fun Gemueserolle(inputViewModel: InputViewModel){
    val gemueserolleAnzahl by inputViewModel.gemueserolleAnzahl.observeAsState(0)

    Row ()
    {
        CustomTagText(text = stringResource(R.string.gemueserolle))

        IconButton(
            onClick = { inputViewModel.minusGemueserolle() }) {

            Icon(imageVector = Icons.Outlined.ArrowBack, contentDescription = "Delete")
        }

        IconButton(onClick = { inputViewModel.plusGemueserolle() }) {

            Icon(imageVector = Icons.Outlined.Add, contentDescription = "Add")

        }

        CustomAnzahl(gemueserolleAnzahl.toString())
    }

}

@Composable
fun Ergebnis(preis: Float){

    Row {

        CustomBoldHeadline(text = stringResource(R.string.preis))

        Spacer(modifier = Modifier.width(15.dp))

        CustomBoldHeadline(text = preis.toString() + "€")
    }
    

}

@Composable
fun Reset(inputViewModel: InputViewModel){

    IconButton(
        onClick = {inputViewModel.preisReset()}) {

        Icon(   imageVector = Icons.Outlined.Delete,
                contentDescription = "Reset",
                Modifier.size(size = 150.dp),
                Color.Red)

    }
}

@Composable
fun Statistik(inputViewModel: InputViewModel){


    val gluehweinStatistik by inputViewModel.gluehweinStatistik.observeAsState(0)
    val kinderpunschStatistik by inputViewModel.kinderpunschStatistik.observeAsState(0)
    val softgetraenkStatistik by inputViewModel.softgetraenkStatistik.observeAsState(0)
    val bierStatistik by inputViewModel.bierStatistik.observeAsState(0)
    val burgerStatistik by inputViewModel.burgerStatistik.observeAsState(0)
    val gemueserolleStatistik by inputViewModel.gemueserolleStatistik.observeAsState(0)


    Row (Modifier.fillMaxWidth(1f)){
        Row (Modifier.width(150.dp)) {
            Text(text = stringResource(R.string.gluehwein))
            Spacer(modifier = Modifier.padding(start = 10.dp))
            Text(text = gluehweinStatistik.toString())
        }

        Row {
            Text(text = stringResource(R.string.kinderpunsch))
            Spacer(modifier = Modifier.padding(start = 10.dp))
            Text(text = kinderpunschStatistik.toString())
        }
    }

    Row (Modifier.fillMaxWidth(1f)){
        Row (Modifier.width(150.dp)) {
            Text(text = stringResource(R.string.softgetraenk))
            Spacer(modifier = Modifier.padding(start = 10.dp))
            Text(text = softgetraenkStatistik.toString())
        }

        Row {
            Text(text = stringResource(R.string.bier))
            Spacer(modifier = Modifier.padding(start = 10.dp))
            Text(text = bierStatistik.toString())
        }
    }

    Row (Modifier.fillMaxWidth(1f)){
        Row (Modifier.width(150.dp)){
            Text(text = stringResource(R.string.burger))
            Spacer(modifier = Modifier.padding(start = 10.dp))
            Text(text = burgerStatistik.toString())
        }

        Row {
            Text(text = stringResource(R.string.gemueserolle))
            Spacer(modifier = Modifier.padding(start = 10.dp))
            Text(text = gemueserolleStatistik.toString())
        }
    }

}

@Composable
fun Endpreis(inputViewModel: InputViewModel) {
    val preis by inputViewModel.preis.observeAsState(0f)
    Ergebnis(preis)

}