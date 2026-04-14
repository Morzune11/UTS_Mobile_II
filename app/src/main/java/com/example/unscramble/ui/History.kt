package com.example.unscramble.ui

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("History")
data class History(

    @PrimaryKey
    val id: Int? =null,
    val percobaan: Int? = null,
    val skor: Int? =null,
    val tebakan_benar: Int? = null
)