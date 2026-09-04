package com.example.petshop

class Sad(date: String): Mood(date) {
    override fun explain(): String {
        return "The date is $date"
    }
}