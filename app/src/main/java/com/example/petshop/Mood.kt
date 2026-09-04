package com.example.petshop

abstract class Mood(val date: String) {
    abstract fun explain(): String
}