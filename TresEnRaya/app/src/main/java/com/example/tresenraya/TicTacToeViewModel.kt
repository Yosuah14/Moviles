package com.example.tresenraya

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.ObservableArrayMap

class TicTacToeViewModel : BaseObservable() {
    val cells = ObservableArrayMap<String, String>()

    // Variable que controla el turno del jugador
    private var playerXTurn = true

    // Función para manejar el clic en una celda
    fun onCellClicked(row: Int, col: Int) {
        val key = "$row$col"
        if (cells[key] == null) {
            cells[key] = if (playerXTurn) "X" else "O"
            playerXTurn = !playerXTurn
            notifyChange()
        }
    }

    // Función para reiniciar el juego
    fun onResetClicked() {
        cells.clear()
        playerXTurn = true
        notifyChange()
    }

    // Función para verificar el ganador o empate
    @get:Bindable
    val winner: String?
        get() {
            // Lógica para verificar el ganador o empate aquí
            // Debes implementar la lógica de verificación de ganador
            return null
        }
}
