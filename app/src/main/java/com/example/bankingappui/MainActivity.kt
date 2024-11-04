package com.example.bankingappui

import android.os.Bundle
import android.renderscript.ScriptGroup.Input
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bankingappui.ui.theme.BankingAppUITheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      BankingAppUITheme {
        Scaffold(modifier = Modifier
          .fillMaxSize(),
          bottomBar = {
            BottomNavigationBar()
          }
        ) { innerPadding ->

          HomeScreen(innerPadding)

        }
      }
    }
  }
}

@Composable
fun HomeScreen(innerPadding: PaddingValues) {
  Column (
    modifier = Modifier
      .padding(innerPadding)
      .fillMaxSize()
  ) {

    //WalletSection()
    Spacer(modifier = Modifier.height(16.dp))
    //CardsSection()
    //FinanceSection()
    //CurrenciesSection()

  }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview() {
  BankingAppUITheme {
    HomeScreen(innerPadding = PaddingValues(0.dp))
  }
}
