package com.sudhirtheindian.weatherapp.presentation.weather


import androidx.compose.foundation.layout.*

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SearchBar(
    value: String,
    onValueChange: (String) -> Unit,
    onSearch: () -> Unit
) {

    Row {

        OutlinedTextField(

            value = value,

            onValueChange = onValueChange,

            modifier = Modifier.weight(1f),

            label = {
                Text("City")
            }
        )

        Spacer(Modifier.width(8.dp))

        Button(
            onClick = onSearch
        ) {

//            Icon(
//                Icons.Default.Search,
//                null
//            )
        }
    }
}