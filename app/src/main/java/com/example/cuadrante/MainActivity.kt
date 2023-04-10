package com.example.cuadrante

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrante.ui.theme.CuadranteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadranteTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun PantallaFinal(modifier: Modifier = Modifier){
    Column(modifier = modifier.fillMaxWidth()){
        //1f especifica a proporción. Por exemplo poderíamos dar a un elemento 1f e a outro
        //elemento 2f. O segundo tería o dobre de tamaño que o anterior
        Row(modifier = Modifier.weight(1f)){
            Recuadro(
                title = stringResource(R.string.A1),
                description = stringResource(R.string.A2),
                backgroundColor = Color.Green,
                modifier = Modifier.weight(1f)
            )
            Recuadro(
                title = stringResource(R.string.B1),
                description = stringResource(R.string.B2),
                backgroundColor = Color.Green,
                modifier = Modifier.weight(1f)
            )
        }
        Row(modifier = Modifier.weight(1f)){
            Recuadro(
                title = stringResource(R.string.C1),
                description = stringResource(R.string.C2),
                backgroundColor = Color.Green,
                modifier = Modifier.weight(1f)
            )
            Recuadro(
                title = stringResource(R.string.D1),
                description = stringResource(R.string.D2),
                backgroundColor = Color.Green,
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun Recuadro(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CuadranteTheme {
        PantallaFinal()
    }
}