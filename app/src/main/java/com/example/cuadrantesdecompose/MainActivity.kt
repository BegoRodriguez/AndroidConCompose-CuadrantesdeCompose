package com.example.cuadrantesdecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.expandHorizontally
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrantesdecompose.ui.theme.CuadrantesDeComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CuadrantesDeComposeTheme {
                CuatroCuadrantes()
            }
        }
    }
}

@Composable
fun Cuadrante(titulo: String, texto: String, modifier: Modifier = Modifier ) {
   Column (verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier) {
        Text(
            text = titulo,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(0.dp,0.dp,0.dp,16.dp)

        )
        Text(
            text = texto,
            textAlign = TextAlign.Justify,

        )
    }
}

@Composable
fun CuatroCuadrantes() {

     Column (verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxSize()) {
         Row(horizontalArrangement = Arrangement.SpaceEvenly)  {
             Cuadrante(
                 titulo = stringResource(R.string.title_1),
                 texto = stringResource(R.string.text_1),
                 modifier = Modifier
                     .background(Color(0xFFEADDFF))
                     .weight(0.5f,true)
                     .fillMaxSize(0.5f)
                     .padding(16.dp)

             )
             Cuadrante(
                 titulo = stringResource(R.string.title_2),
                 texto = stringResource(R.string.text_2),
                 modifier = Modifier
                     .background(Color(0xFFB69DF8))
                     .weight(0.5f,true)
                     .fillMaxSize(0.5f)
                     .padding(16.dp)
                )

            }
         Row(horizontalArrangement = Arrangement.SpaceEvenly) {

             Cuadrante(
                 titulo = stringResource(R.string.title_3),
                 texto = stringResource(R.string.text_3),
                 modifier = Modifier
                     .background(Color(0xFFD0BCFF))
                     .weight(0.5f,true)
                     .fillMaxSize(1f)
                     .padding(16.dp)

             )
             Cuadrante(
                 titulo = stringResource(R.string.title_4),
                 texto = stringResource(R.string.text_4),
                 modifier = Modifier
                     .background(Color(0xFFF6EDFF))
                     .weight(0.5f,true)
                     .fillMaxSize(1f)
                     .padding(16.dp)

             )
         }
     }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CuadrantesDeComposeTheme {
        CuatroCuadrantes()
    }
}

