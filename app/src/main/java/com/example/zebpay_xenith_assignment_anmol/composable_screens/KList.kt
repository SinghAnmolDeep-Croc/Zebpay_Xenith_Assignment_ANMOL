package com.example.zebpay_xenith_assignment_anmol.composable_screens

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items

class KList<T> {

    private var padding: Dp = 0.dp
    private var headerTitle: String? = null
    private var items: List<T> = emptyList()
    private var itemContent: @Composable (T) -> Unit = {}
    private var onItemClick: ((T) -> String)? = null

    fun padding(padding: Dp): KList<T> {
        this.padding = padding
        return this
    }

    fun header(title: String): KList<T> {
        this.headerTitle = title
        return this
    }

    fun items(items: List<T>, content: @Composable (T) -> Unit): KList<T> {
        this.items = items
        this.itemContent = content
        return this
    }

    fun onItemClick(callback: (T) -> String): KList<T> {
        this.onItemClick = callback
        return this
    }

    @Composable
    fun Render() {
        LazyColumn(modifier = Modifier.padding(padding)) {
            headerTitle?.let {
                item {
                    Text(text = it)
                    Spacer(modifier = Modifier.height(8.dp))
                }
            }

            items(items) { item ->
                itemContent(item)
            }
        }
    }

    //If needed for usage in other classes
    companion object {
        val instance: KList<Any> = KList()
        val <T> KList<T>.typed: KList<T> get() = this
    }
}