package com.example.zebpay_xenith_assignment_anmol.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.zebpay_xenith_assignment_anmol.composable_screens.KList
import com.example.zebpay_xenith_assignment_anmol.ui.theme.Zebpay_Xenith_Assignment_ANMOLTheme
import com.example.zebpay_xenith_assignment_anmol.ui.theme.space

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Zebpay_Xenith_Assignment_ANMOLTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    KListScreenContent(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun KListScreenContent(modifier: Modifier = Modifier) {
    val coinList = listOf(
        "BitCoin", "Ethereum", "Solana", "Doge Coin", "MEME COINS", "Phalla",
        "BitCoin", "Ethereum", "Solana", "Doge Coin", "MEME COINS", "Phalla",
        "BitCoin", "Ethereum", "Solana", "Doge Coin", "MEME COINS", "Phalla",
        "BitCoin", "Ethereum", "Solana", "Doge Coin", "MEME COINS", "Phalla"
    )

    KList<String>()
        .padding(16.dp)
        .header("Top Gainers")
        .items(coinList) { coin ->
            KListItem(coin)
        }
        .Render()
}

@Composable
fun KListItem(title: String) {
    Card(
        modifier = Modifier
            .padding(vertical = MaterialTheme.space.space4, horizontal = 8.dp)
            .fillMaxWidth(),
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(MaterialTheme.space.space16),
            style = MaterialTheme.typography.bodySmall
        )
    }
}

//@Composable
//fun TopGainersScreen(viewModel: CoinsViewModel = hiltViewModel()
//) {
//    val coins by viewModel.coins.collectAsState()
//
//    KList(coins,
//        padding = 10.dp,
//        header = "Top Gainers") { coin ->
//        KListItem(coin)
//    }
//
//    KList
//        .padding(10.dp)
//        .header(title = "Top Gainers")
//        .items(coins) { coin ->
//            KListItem(coin)
//        }
//}